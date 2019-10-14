
import java.io.*;
class Kaprekar
{
static int i,p,q,c=0;
int num;
public void kaprekar(int x)
{
int digit,rev=0;int no;num=x*x;digit=0;no=x;
while(no >0)
{
digit++;
no=no/10;
}
no=num;
while(digit > 0)
{
rev=rev*10+no%10;
no=no/10;
digit--;
}

// 'rev' holds the right part in reverse order and 'no' holds the left part
rev=reverse(rev);
if((rev+no)==x)
{
System.out.print("  "+x);
c++;
}
}
private int reverse(int n)
{
int r=0;
while(n > 0)
{
r=r*10+n%10;
n=n/10;
}
return r;
}
public static void main(String args[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the Lower Range:");
p=Integer.parseInt(br.readLine());
System.out.println("Enter the Upper Range:");
q=Integer.parseInt(br.readLine());
Kaprekar ob=new Kaprekar();
if(p >=q)
{
System.out.println("Wrong Entry...");
return;
}
System.out.println("THE KAPREKAR NUMBERS ARE:");
for(i=p;i<=q;i++)
{
ob.kaprekar(i);
}
System.out.println();
System.out.println("FREQUENCY OF KAPREKAR NUMBERS IS:"+c);
}

}