import java.io.*;
import java.util.*;
class String2010
    
{
    public static void main()throws IOException
    
    {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter a sentence");
        String s=br.readLine();
        int len =s.length();
        s=s.toUpperCase();
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
           
           int c=1;
           for(int i=0;i<count;i++)
           {
               
               
               for(int j=i+1;j<count;j++)
               
               { 
                   if(a[i].equals(a[j]))
                   {
                   
                    c++;
                   
                   }
            }
            
            System.out.println("Frequency of word"+a[i]+"is"+c);
            c=1;
        }
    }
    else 
    {
       System.out.println("Invalid input");  
    }  
            
        
            
            
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
}