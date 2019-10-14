//s=1/4-1/9+1/16.............n terms

public class series18
{
   public static void main(int n)
   {
      int term=1,i;
      for(i=1;i<=n;i++)
      { 
        if(i%2==0)
        term=term-(1/(int)Math.pow(i+i,2));
         else
         term=term+(1/(int)Math.pow(i+i,2));   
      }
       System.out.println(term);
    }
     
}
