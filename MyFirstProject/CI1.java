
import java.util.*;
public class CI1
{
    public static void main(String args[])
    {
        
        double p,r,i;
        int t;
        double amt;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter principl,rate,time");
        p=sc.nextFloat();
        r=sc.nextFloat();
        t=sc.nextInt();
        amt=p*Math.pow((1+(r/100)),t);
        i=amt-p;
        System.out.println("Interest and Amount is"+i+" "+amt);
        
    }
    
}
