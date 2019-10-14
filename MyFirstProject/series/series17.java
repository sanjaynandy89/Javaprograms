//s=1/2+2/3+.........n terms
public class series17
{
     public static void main(int n)
  {
      int term=-1,i,sum=0;
      int p=1;
      for(i=1;i<=n;i++)
      {   
          sum=sum+term;
          term=term+p;
          p=p+2;
          
      }
        System.out.println(sum);
    }
}
