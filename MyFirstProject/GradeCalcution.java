import java.util.*;
public class GradeCalcution
{   
    public static void main(String args[])
    {   int marks;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks");
        marks=sc.nextInt();
        if(marks>90 && marks<=100)
        {
            System.out.println("Grade A+");
            
        }  
        if(marks>80 && marks<=90)
        {
            
            System.out.println("Grade A");
        }
        if(marks>70 && marks<=80)
        {
            
            System.out.println("Grade B+");
        }
        if(marks>60 && marks<=70)
        {
            
            System.out.println("Grade B");
        }
        if(marks>50 && marks<=60)
        {
            
            System.out.println("Grade C");
        }
        if(marks>40 && marks<=50)
        {
            
            System.out.println("Grade D");
        }
        if(marks<40)
        {
            System.out.println("Fail");
        }
}
}
