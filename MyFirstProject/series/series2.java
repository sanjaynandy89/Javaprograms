

public class series2
{
  public void main(int n,int x)
  {
      double term=1,i;
      for(i=1;i<n;i++)
      { 
        if(i%2==0)
        term=term-Math.pow(x,i);
         else
         term=term+Math.pow(x,i);   
      }
       System.out.println(term);
    }
     
}
