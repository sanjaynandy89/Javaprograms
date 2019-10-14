
/**
 * Write a description of class StringPattern1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class StringPattern7
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of row");
        int len=sc.nextInt();;
        int p;
        for(int i=len;i>=1;i--)
        { 
            p=65;
            for(int j=1;j<=i;j++)
            {   
                System.out.print((char)p);
                p++;
            } 
            System.out.println();
        }    
        
    }    
}
