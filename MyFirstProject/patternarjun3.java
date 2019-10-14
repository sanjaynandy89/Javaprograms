import java.util.*;
public class patternarjun3
{  public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n=sc.nextInt();
        int p=n;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=p;j++)
            {
                if(j%2==0)
                {
                    System.out.print(0);
                }
                else
                {
                    System.out.print(1);
                }
            }
            p=p-1;
            System.out.println();
        }
    }
}
