//s=a2+a4+a6........n terms

public class series12
{
      public static void main(int n)
    {
      double term=0,i,a=1;
      for(i=1;i<=n;i++)
      { 
        term=term+a*(Math.pow(2,i)); 
      }
       System.out.println(term);
    }
     
}