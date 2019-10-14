import java.util.*;
public class GreatestProg
{
    public static void main(String []args)
    {
         int a,b,c;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a numbers");
         a=sc.nextInt();
         b=sc.nextInt();
         c=sc.nextInt();
         if(a>b)
         {
              if(a>c)
              {
                 System.out.println("Greatest is"+a); 
                  
              } 
              else
              {
                System.out.println("Greatest is"+c);  
                  
              }    
             
         }
         else
         {
            if(b>c)
            {
                System.out.println("Greatest is"+b);
            }
            else
            {
                
               System.out.println("Greatest is "+c); 
                
            } 
         }
        
    }
}
