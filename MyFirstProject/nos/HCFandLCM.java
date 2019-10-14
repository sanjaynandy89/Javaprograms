
public class HCFandLCM
{
    public static void main(int a,int b)
    {
        int lcm,hcf=0,i,num;
        if(a>b)
        num=a;
       else
       num=b;
       for(i=1;i<=num;i++)
       {
           if((a%i==0)&&(b%i==0))
        { hcf=i;
        
       
    }
}
 lcm=(a*b)/hcf;
        System.out.println("hcf "+hcf+" lcm "+lcm);
}
            }