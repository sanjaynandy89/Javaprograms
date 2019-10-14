public class happy
{
   public static void main(int n)
   {
       int d,i,s=n;
       while(s>9)
       {
        n=s;
        s=0;
       while(n!=0)
       {
           d=n%10;
           s=s+(d*d);
           n=n/10;
           d=n;
        }
       }
       if(s==1)
       System.out.println("Happy number");
        else
        System.out.println("Not a happy number");
        
    }
}
               