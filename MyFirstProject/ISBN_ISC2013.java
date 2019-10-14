import java.io.*;
class ISBN_ISC2013
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter a 10 digit code : ");
String s=br.readLine();
 
int len=s.length();
 
if(len!=10)
System.out.println("Output : Invalid Input");
else
{
char ch;
int dig=0, sum=0, k=10;
for(int i=0; i<len; i++)
{
ch=s.charAt(i);
if(ch=='X')
    dig=10;
else
    dig=ch-48;
sum=sum+dig*k;
k--;
}
 

 
System.out.println("Output : Sum = "+sum);
if(sum%11==0)
System.out.println("Leaves No Remainder - Valid ISBN Code");
else
System.out.println("Leaves Remainder - Invalid ISBN Code");
}
}
}