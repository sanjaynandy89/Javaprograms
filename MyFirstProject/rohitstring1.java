
/**
 * Write a description of class rohitstring1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rohitstring1
{
   public static void main(String args[])
   {
     String str="COMPUTER";
     char ch;
     int len=str.length();
     for(int i=0;i<len;i++)
     {
         
         
         ch=str.charAt(i);
         for(int j=0;j<i;j++){
           System.out.print(" ");
          
         }  
         System.out.print(ch);
         System.out.println();
     }
    
  }
}
