
/**
 * Write a description of class QUESTION1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
 import java.io.*;
import java.util.*;
public class QUESTION1
{
    public static void main(String args[])throws IOException{
   String txt,sent;
     int len;
     txt=" ";
     sent="";
     System.out.println("Enter the String");
     BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
     txt=br.readLine();
      String s[]=new String[20];
      String s1[]=new String[20];
         String str="";
        StringTokenizer obj=new StringTokenizer(txt);
     int words=obj.countTokens();
    
     for(int k=0;k<words;k++)
     {
         
        s[k]=obj.nextToken();
      
       
    }
     int x=0;
    for(int k=0;k<words;k++)
    {
         str=s[k];
        
       
     
    String str1="";
   
    for(int i=0;i<str.length();i++)
    {
        char ch=' ';
        ch=str.charAt(i);
        int c=1;
        for(int j=i+1;j<str.length();j++)
        {
            if(str.charAt(i)==str.charAt(j))
            {
                
                c++;
            } 
            
             
        }   
        
       str1=str1+ch+c;
        c=1;
        
        
        
    }
    s1[x++]=str1;
    str1="";
}
for(int i=0;i<x;i++)
System.out.print(s1[i]+" ");
    
} 

    }

    