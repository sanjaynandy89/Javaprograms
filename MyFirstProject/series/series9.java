//s=7+14+21+...n terms
public class series9
{
public static void main(int n)
  {
      int term=7,sum=0,i;
      for(i=1;i<=n;i++)
      { 
       if(i>=2)
        {
          sum=sum+(term*i);
        }
        else
            sum=sum+term;
        
     }
     System.out.println("final sum= "+sum);
}
}
