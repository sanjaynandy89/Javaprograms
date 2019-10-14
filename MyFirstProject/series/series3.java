

public class series3
{
  public void main(int n,int x)
  {
      double term=1,i;
      for(i=1;i<n;i++)
      { 
        term=term+(Math.pow(x,i)/i);
      }
       System.out.println(term);
    }
     
}
