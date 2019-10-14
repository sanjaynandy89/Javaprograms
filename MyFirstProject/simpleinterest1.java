
//import java.util.*;
public class simpleinterest1
{
    public static void  main(float p,float r,int t)
    {
       // float p,r,i,amt;
       // int t;
       // Scanner sc=new Scanner(System.in);
       float i,amt;
        System.out.println("Enter principa,rate,time");
       // p=sc.nextFloat();
        //r=sc.nextFloat();
        //t=sc.nextInt();
        i=p*r*t/100;
        amt=p+i;
        System.out.println("interest ad amount is"+i+" "+amt);
    }
}

