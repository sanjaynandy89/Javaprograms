
import java.util.*;
public class StudentLoop
{
    public static void main(String args[])
    {   int n;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
         sum=sum+i;
            
        }
        System.out.println("Sum is"+sum);
    }    
}
