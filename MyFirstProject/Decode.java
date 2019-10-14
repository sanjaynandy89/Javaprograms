
import java.io.*;
public class Decode
{
    public static void main(String args[])throws IOException
    {
        
        int i,j,k,l;
        String str1,str2="",str3="",str4="";
        char chr ,ch;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the coded String");
        str1=br.readLine();
        l=str1.length();
        for(i=0;i<l;i++)
        {
            str2=str2+str1.charAt(i);
            
            
        } 
        i=0;
        while(i<l)
        {
           ch=str2.charAt(i);
           if(ch>'1')
           {
             str3=str2.substring(i,i+2);
             k=Integer.parseInt(str3);
             chr=(char)k;
             i=i+2;
             
               
            } 
            else
            {
               str3=str2.substring(i,i+3);
             k=Integer.parseInt(str3);
             chr=(char)k;
             i=i+3;    
            }    
            str4=str4+chr;
        }
        System.out.println("The original Encoded message");
        System.out.println(str1);
        System.out.println("The decoded message");
         System.out.println(str4);
        
    }
}
