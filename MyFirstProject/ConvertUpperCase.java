import java.util.*;
/**
 * Write a description of class ConvertUpperCase here.
 * convert first character of each word in upper case
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ConvertUpperCase
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str,str1="";
        System.out.println("Enter a String");
        str=sc.nextLine();
        int len=str.length();
        System.out.println(str);
        str1=str1+Character.toUpperCase(str.charAt(0));
        for(int i=1;i<len;i++)
        {
            char ch=str.charAt(i);
            char ch1=' ';
            if(ch==' ')
            {
                ch1=str.charAt(i+1);
                str1=str1+' '+Character.toUpperCase(ch1);
                i=i+1;
                
            } 
            else
            {
              str1=str1+ch;    
                
            }    
            
        }   
        System.out.println("New String is");
        System.out.println(str1);
        
        
        
    }    
}
