import java.util.*;

public class DigitFrequency
{
   public static void main(String args[])
   {
        
       Scanner sc =new Scanner(System.in);
       System.out.println("Enter the number");
       long num=sc.nextLong();
       long num1;
       int count=0;
       long d;
       for(int i=0;i<=9;i++)
       {   
           num1=num;
           while(num1>0)
           {
           d=num1%10;
           if(d==i)
           count++;
           num1=num1/10;
           }
           if(count>0)
            System.out.println("The digit"+i+"frequency"+count);
           count=0;
           
        }  
    
   }   
}
