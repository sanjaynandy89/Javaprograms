import java.util.*;
public class MultipleHarshad
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int c, d, sum ,sum1=0,n1=0,count=0;
        while(n>1)
        {       sum = 0;
               c=n;
               while(c>0)
               {
               d = c%10;
               sum = sum + d;
               c = c/10;
               }
               if(n%sum==0)
               {
               sum1=sum;
               n1=n;
               n=n/sum;

               }
               else
               {
                   System.out.println("Not an harshad");
                   break;
               }

        }
            if(n1%sum1==0)
            System.out.println("Number is multiple harshad");
            else
            System.out.println("Number is not multiple harshad");    
    }
}