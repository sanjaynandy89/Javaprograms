import java.util.*;
public class patternarjun
{ 
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n=sc.nextInt();
        int b=n-1;
        for(int i=1;i<=n;i++)
        {    
            for(int j=1;j<=b;j++)
            {
                System.out.print(" ");
            }
            b--;
            for(int k=1;k<=i;k++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }        
}
