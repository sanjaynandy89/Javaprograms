import java.io.*;
import java.util.*;
public class String6
{
   public static void main()throws IOException
   {
     String str=" ";
     String st1[]=new String[20];
     System.out.println("Enter a String");
     BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
     str=br.readLine();
     StringTokenizer obj=new StringTokenizer(str);
     int words=obj.countTokens();
     char chr=' ';
     int p;
     int count =0;
     for(int k=0;k<words;k++)
     {
       String s=obj.nextToken();
       StringBuffer buffobj=new StringBuffer(s);
       int l=buffobj.length();
       for(int i=0;i<l;i++)
      {
       chr=str.charAt(i);
       if((chr>='a' && chr<='y')||(chr>='A' && chr<='Y'))
       {
           p=(int) (chr+2);
           chr=(char)(p);
           st1[i]=st1[i]+chr;
           count++;
       } 
       else
       {
       if(chr>='Z'|| chr<='z')
       {
          
          p=(int) (chr-24);
          chr=(char)(p);
          st1[i]=st1[i]+chr;
          count++;
       }
       }
        for(int j=0;j<count;j++)
        {
            System.out.println(st1[j]);
        }
        count=0;
      }
      }   
}  } 