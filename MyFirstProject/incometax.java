import java.util.*;
public class incometax
{      
    
     public static void main(String args[])
     {
         String name;
         int ti,age;
         double tax=0.0;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the name age and income");
         name=sc.next();
         age=sc.nextInt();
         ti=sc.nextInt();
         if(ti<=160000)
         {
             tax=0;
         } 
         else if(ti>160000 && ti<=500000)
         {
             tax=(ti-160000)*0.10;
             
         }  
         else if(ti>500000 && ti<=800000)
         {
               tax=(ti-500000)*0.20+34000;
         }
         else
         {
            tax=(ti-800000)*0.30+94000;
         }
         System.out.println("Name"+name+"\tage"+age+"\tTax"+tax);
     }
}     