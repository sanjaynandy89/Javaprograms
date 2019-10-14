import java.io.*;
import java.util.*;
public class Stringascending
{
   public static void main()throws IOException
   {
     String str=" ";
     System.out.println("Enter a String");
     BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
     str=br.readLine();
     StringTokenizer obj=new StringTokenizer(str);
     int words=obj.countTokens();
     int i;
     for(int k=0;k<words;k++)
     {
       String s=obj.nextToken();
       StringBuffer buffobj=new StringBuffer(s);
       int l=buffobj.length();
       for(i=0;i<l;i++)
       {
         for(int j=0;j<l-i-1;j++)
         {
          if(buffobj.charAt(j)>buffobj.charAt(j+1))
          {
             char temp=buffobj.charAt(j);
              buffobj.setCharAt(j,buffobj.charAt(j+1));
             buffobj.setCharAt(j+1,temp);
          }
            
         }    
          
       } 
      System.out.println(buffobj);
     }    
     
     
   }    
}
