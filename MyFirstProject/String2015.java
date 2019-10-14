import java.io.*;
import java.util.*;
class String2015
    
{
    public static void main()throws IOException
    
    {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter a sentence");
        String s=br.readLine();
        int len =s.length();
        StringTokenizer st=new StringTokenizer(s,".? ");
        int count=st.countTokens();
        String a[]=new String[count];
        int index=0;
        if(s.charAt(len-1)=='.'||s.charAt(len-1)=='?')
        {
           while(st.hasMoreTokens())
           {
               
               a[index++]=st.nextToken();
               
           }  
           for(int i=0;i<index;i++)
           {
               String str=a[i];
               int len1=str.length();
                 char ch=str.charAt(0);
                  String str1=Character.toUpperCase(ch)+str.substring(1,len1);
                   System.out.print(str1+" ");
                  
             
               
               
           }   
            System.out.println();
            
          for ( int j=0;j<index;j++)
        {
            String str2=a[j];
            int len2=str2.length();
            int c=0;
            int b=0;
            for (int k=0;k <len2 ;k++)
            { char ch1=str2.charAt(k);
               if(ch1=='A' || ch1=='a'||ch1=='E'|| ch1=='e'|| ch1=='u'|| ch1=='U'|| ch1=='o'|| ch1=='O'|| ch1=='i'|| ch1=='I')
               {
                    c++;
                }
                else  
                {
                    b++;
                }
            }
         System.out.println( "\t String \t vowels \t consonent");
          System.out.println( "\t  "+str2+" \t"+c+ "  \t"+b);
        }
    }
    
        else
        {
          System.out.println("Ivalid String");  
        }   
        
        
        
        
        
        
        
        
        
        
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    