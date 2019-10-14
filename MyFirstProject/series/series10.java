//s=2-4+8-16..........n terms

public class series10
{
    public static void main(int n)
    {
      double term=0,i;
      for(i=1;i<=n;i++)
      { 
        if(i%2==0)
        term=term-Math.pow(2,i);
         else
         term=term+Math.pow(2,i);   
      }
       System.out.println(term);
    }
     
}
