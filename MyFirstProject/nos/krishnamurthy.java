public class krishnamurthy
{
public static void main(int n)
{
int d,i,f=1,r=0,m=n;
while(n!=0)
{
d=n%10;
for(i=1;i<=d;i++)
{
f=f*i;
}
r=r+f;
f=1;
n=n/10;
}
if(r==m)
{
System.out.println(m+" is a spcl no.");
}
else
System.out.println(m+" is not a spcl no.");
}
}
