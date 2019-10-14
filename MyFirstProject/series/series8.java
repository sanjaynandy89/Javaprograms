

public class series8
{
  public static void main(int n)
  {
      int i,d=4,term=9;
      int sum=0;
      for(i=1;i<=n;i++)
      {
          
          sum=sum+term;
          term=term+d;
        }
          System.out.print(sum);
}
}