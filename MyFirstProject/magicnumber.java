

public class magicnumber
{
   public static void main(int n)
   {
          int a,b,c,s;
          s=n;
         while(s>9){
            n=s;s=0; 
          while(n>0)
          {
             a=n/10;
             b=a*10;
             c=n-b;
             s=s+c;
             n=a;
             
          }  
        }
        if(s==1)
        System.out.println("Magic Number");
        else 
        System.out.println("Not Magic Number");
   }    
}    
