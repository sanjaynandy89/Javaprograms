import java.io.*;
import java.util.*;
class LongestWord
{

public static void  main() throws IOException
{
String s,str,sarr[],strarr[];
int i,j,n,c,index=0,fre[],index1=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the Paragraph:");
str=br.readLine();
StringTokenizer st=new StringTokenizer(str,",.? ");
n=st.countTokens();
sarr=new String[n];
 for(i=0;i<n;i++)
     {
         
        sarr[i]=st.nextToken();//stores the tokens in array s[]
        
       
    }
    int max=sarr[0].length();
    c=0;
    for(i=0;i<n;i++)
    {
         
          if(max<sarr[i].length()){
              
          max=sarr[i].length();
          
        }
        
    }   
    for(i=0;i<n;i++)
    {
          if(max==sarr[i].length())
          System.out.print(" "+sarr[i]);
        
    }   
   
}
}