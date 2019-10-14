import java.io.*;
class Smith
{
static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
public static void main() throws IOException
{

System.out.print("Enter a Number : ");
int n=Integer.parseInt(br.readLine());
Smith ob=new Smith();
int a=ob.sumDig(n);// finding sum of digit
int b=ob.sumPrimeFact(n); //finding sum of prime factors
System.out.println("Sum of Digit = "+a);
System.out.println("Sum of Prime Factor = "+b);
if(a==b)
System.out.print("It is a Smith Number");
else
System.out.print("It is Not a Smith Number");
}
 
//function for finding sum of digits
int sumDig(int n)
{
int s=0;
while(n>0)
{
s=s+n%10;
n=n/10;
}
return s;
}
 
//function for generating prime factors and finding their sum
int sumPrimeFact(int n)
{
int i=2, sum=0;
while(n>1)
{
if(n%i==0)
{
sum=sum+sumDig(i); //Here 'i' is the prime factor of 'n' and we are finding its sum


n=n/i;
}
else
i++;
}
return sum;
}
 

}


