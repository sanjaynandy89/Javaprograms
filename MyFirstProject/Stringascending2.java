import java.io.*;
import java.util.*;
public class Stringascending2
{
   public static void main()throws IOException
   {
     String str=" ";
     String temp=" ";
     int c=0;
     String s[]=new String[20];
     System.out.println("Enter a String");
     BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
     str=br.readLine();
     StringTokenizer obj=new StringTokenizer(str);
     int words=obj.countTokens();
    
     for(int k=0;k<words;k++)
     {
         
        s[k]=obj.nextToken();
        c=c+1;
       
    }
    
    for(int k=0;k<words;k++)
     {
         
       System.out.println(s[k]);
       System.out.println(c);
       
    }
    for(int i=0;i<c;i++)
    {
        for(int j=0;j<c-i-1;i++)
        {
          if(s[j].length()>s[j+1].length())
          {
               temp=s[j];
               s[j]=s[j+1];
               s[j+1]=temp;
          }   
         if(s[j].length()==s[j+1].length())
          {
            if(s[j].compareTo(s[j+1])>0)  
            {
              temp=s[j];
              s[j]=s[j+1];
              s[j+1]=temp;
            }    
          }    
        }
    }
    for(int k=0;k<words;k++)
     {
         
       System.out.println(s[k]);
       
    }
    
}
}