import java.io.*;
public class Mobious
{
   public static void main(String args[])throws IOException
   {
   
       
       int j,p,n,c;
       c=0;
       double m;
       m=0.0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter your number");
         n=Integer.parseInt(br.readLine());
       if(n==1)
       System.exit(0);
       j=2;p=0;
       while(j<=n)
       {
        if(n%j==0)
        {
          c++;
          n=n/j;
          p++;
       
       if(p>1)
       {
         m=0;
         break;
       } 
       } 
       else
       {
           j++;
           p=0;   
           
        } 
    }
        if(p<=1)
        m=(Math.pow(-1,c));
        System.out.println(m);
        
      }    
}
