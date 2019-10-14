//s=1-4+27-64.......n terms
public class series11
{
      public static void main(int n)
       {
      double term=0,i;
      for(i=1;i<=n;i++)
      { 
        if(i%2==0)
        term=term-Math.pow(i,i);
         else
         term=term+Math.pow(i,i);   
      }
       System.out.println(term);
    }
     
}