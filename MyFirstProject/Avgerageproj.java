
import java.util.*;
public class Avgerageproj
{
public static void main(String args[])
{
    int sub1,sub2,sub3,sub4,sub5;
    float avg;  
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the marks of five subject");
    sub1=sc.nextInt();
    sub2=sc.nextInt();
    sub3=sc.nextInt();
    sub4=sc.nextInt();
    sub5=sc.nextInt();
    avg=(sub1+sub2+sub3+sub4+sub5)/5;
    System.out.println("Average marks is"+avg);
    if(avg>90.0 && avg<=100.0)
    {
        System.out.println("Grade A+");
    }
    if(avg>80.0 && avg<=90.0)
    {
      System.out.println("Grade A");
     
    }
    if(avg>70.0 && avg<=80.0)
    {System.out.println("Grade B+");
    
    }
  
    if(avg>60.0 && avg<=70.0)
    {System.out.println("Grade B");
    
    }
    if(avg>50.0 && avg<=60.0)
    {System.out.println("Grade C");
    
    }
    if(avg>40.0 && avg<=50.0)
    {System.out.println("Grade D");
    
    }
    if(avg<40.0)
    {System.out.println("Fail");
    
    }
}
}