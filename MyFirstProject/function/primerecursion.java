
public class primerecursion
{
 int c=0;
public int prime(int n,int y)
{
if(y<=n)
{
if(n%y==0)
{
c++;
}
return(prime(n,y+1));
}
else
return c;
}
public static void main()
{
primerecursion ob=new primerecursion();
int p=ob.prime(11,1);
if(p==2)
System.out.println("Prime ");
else
System.out.println("Not Prime");
}
}