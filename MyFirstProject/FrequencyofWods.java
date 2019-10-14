
import java.io.*;
import java.util.*;
public class FrequencyofWods
{
  public static void main(String args[])throws IOException
  {
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   String str,temp;
   StringTokenizer obj;
   String st[]=new String[20];
   String s1[]=new String[20];
   System.out.println("Enter the sentence:");
   str=br.readLine();
   obj=new StringTokenizer(str," .,?!");
   int words=obj.countTokens();
   int count=1;
    while(obj.hasMoreTokens())
    {   
        for(int k=0;k<words;k++)
        {
        st[k]=obj.nextToken();
        }
        
    }   
        for(int i=0;i<words;i++)
        {
            for(int j=i+1;j<words;j++)
            {   
               if(st[i].compareTo(st[j])<0)
               {
                temp=st[i];
                st[i]=st[j];
                st[j]=temp;
               }
            }
       }
       temp=st[0];
       for(int i=1;i<words;i++)
       {
      if(temp.equals(st[i]))
      count++;
      else
      {
       System.out.println("Frequency of "+temp+" :"+count);
       count=1;
       temp=st[i];
      }
      
     
      }  
          System.out.println("Frequency of "+temp+" :"+count);   
        }   
        
    }
    


