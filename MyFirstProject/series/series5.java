public class series5
{
  public void main(int n,int a)
  {
      double term=1,i,f=1;
      for(i=1;i<n;i++)
      { f=f*i;
        if(i%2==0)
        term=term-Math.pow(a,i)/f;
         else
         term=term+Math.pow(a,i)/f;   
      }
       System.out.println(term);
    }
     
}
