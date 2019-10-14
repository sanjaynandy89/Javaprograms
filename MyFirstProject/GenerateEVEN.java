
import java.util.*;
public class GenerateEVEN
{     
    public static void main(String args[])
    {
      int n;
      int sum=0;
      int p=2;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number of terms");
      n=sc.nextInt();
      System.out.println("Even Terms");
      for(int i=2;i<=n;i++)
      {   sum=sum+p;
          System.out.print(p+"  ");
          p+=2;
      }
    System.out.println("Sum is"+sum);
   }
}
