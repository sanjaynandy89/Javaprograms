
/**
 * Write a description of class rohitstring1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class rohitstring2
{
   public static void main(String args[])
   {
     String str="MORAL";
     char ch;
     int len=str.length();
     int sp=4;
     for(int i=0;i<len;i++)
     {
         
         for(int j=1;j<=sp;j++){
           System.out.print(" ");
          
          
         } 
          sp--;
         System.out.print(str.substring(0,i+1));
         System.out.println();
     }
    
  }
}

