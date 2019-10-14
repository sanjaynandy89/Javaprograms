//s=1/2-1/4+1/6-1/8+...........+1/n terms
public class series16
{
      public static void main(int n)
  {
      double term=0,i;
      for(i=1;i<=n;i++)
      { 
         
        if(i%2==0)
         term=term-1/Math.pow(i+1,2);
         else
         term=term+1/Math.pow(i+1,2);
        
      }
       System.out.println(term);
    }
     
}
 