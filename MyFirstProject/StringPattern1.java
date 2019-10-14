
/**
 * Write a description of class StringPattern1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class StringPattern1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String str=sc.nextLine();
        int len=str.length();
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(str.charAt(j));
            }   
            System.out.println();
        }    
        
    }    
}
