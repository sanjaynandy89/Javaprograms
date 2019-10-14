import java.io.*;
import java.util.*;
public class Piglatin
{
   

    String txt,sent;
     int len;
     
    Piglatin(){
        txt="";
        sent="";
        
        
    }
    void readString()throws IOException{
        System.out.println("Enter the String");
     BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
     txt=br.readLine();
    }
    String convert(String sent1){
        
        len=sent1.length();
        char ch=' ';
        int count=0;
        String str1="";
        for(int i=0;i<len;i++)
        {
           ch=sent1.charAt(i);
           if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
           {
               count=i;
               break;
            
           }
            
        }    
        str1=sent1.substring(count,len)+sent1.substring(0,count)+"AY";
        return str1;
        
    }
    void change()
    {
         String s[]=new String[20];
         String str="";
        StringTokenizer obj=new StringTokenizer(txt);
     int words=obj.countTokens();
    
     for(int k=0;k<words;k++)
     {
         
        s[k]=obj.nextToken();
      
       
    }
    for(int j=0;j<words;j++)
    {
         str=convert(s[j]);
        sent=sent+" "+str;
        str="";
    }   
    System.out.println(sent);
        
    }
   public static void main(String args[])throws IOException{
       Piglatin obj=new Piglatin();
       obj.readString();
       obj.change();
    }
     
    }
