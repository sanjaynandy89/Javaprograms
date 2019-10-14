
/**
 * Write a description of class StringPattern1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class StringPattern8
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of row");
        int len=sc.nextInt();;
        int p=65,q;
        for(int i=len;i>=1;i--)
        { 
            q=p;
            for(int j=1;j<=i;j++)
            {   
                System.out.print((char)q);
                q++;
            } 
            p++;
            System.out.println();
        }    
        
        String n1="46",n2="64";
        int total=Integer.parseInt(n1)+Integer.parseInt(n2);
        System.out.println(total);
        System.out.println("four"+4+2);
        System.out.println("Four"+(4+2));
        String str="Information Technology";
        int p1=str.indexOf('n');
        System.out.println(p1);
        String s1="Hi";
        String s2="Hi";
        System.out.println(s1+"equals"+s2+"---->"+s1.equals(s2));
    }    
}
