import java.io.*;
import java.util.*;
public class Stringassignment4
{   
    void longestWord(String str1)//To find the longest word in the sentence
    {
        
        String sarr[];
        int i,c;
        StringTokenizer st=new StringTokenizer(str1,",.? ");
int n=st.countTokens();
sarr=new String[n];
 for(i=0;i<n;i++)
     {
         
        sarr[i]=st.nextToken();//stores the tokens in array s[]
        
       
    }
    int max=sarr[0].length();//Intialize max to length of the first word
   
    //Find longest word 
    for(i=0;i<n;i++)
    {
         
          if(max<sarr[i].length()){
              
          max=sarr[i].length();//set max tp longest word
          
        }
        
    }   
    //print lomgest word
    for(i=0;i<n;i++)
    {
          if(max==sarr[i].length())//find max is equal to which words length
          System.out.print(" Longest word  "+sarr[i]);
        
    }   
        
    }
      void srtingWordAsscending(String str1)
      { 
          int i,j;
          String temp;
         StringTokenizer st=new StringTokenizer(str1,",.? ");
int n=st.countTokens();
System.out.println();
String sarr[]=new String[n];
int index=0;
while(st.hasMoreTokens())
{
sarr[index++]=st.nextToken();//Store each word in array
}
for(i=0;i< index-1;i++)
{
for(j=i+1;j< index;j++)
{
if(sarr[i].compareTo(sarr[j]) > 0)
{
temp=sarr[i];
sarr[i]=sarr[j];
sarr[j]=temp;
}
}
}
System.out.println("WORD ASSCENDING ORDER");
for(i=0;i< index;i++){
System.out.print(" "+sarr[i]);
System.out.println();
}
          
        }   
   //Find Frequency of ach wod in the sentence     
   void freqWords(String str1){
       String str,temp;
   StringTokenizer st;
  
   String s1[]=new String[20];
 st=new StringTokenizer(str1," .,?!");
   int n=st.countTokens();
    String sarr[]=new String[n];
   int count=1;
    while(st.hasMoreTokens())
    {   
        for(int k=0;k<n;k++)
        {
        sarr[k]=st.nextToken();//store each word in array
        }
        
    }   
       // sort the words in alphabetical order
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {   
               if(sarr[i].compareTo(sarr[j])>0)
               {
                temp=sarr[i];
                sarr[i]=sarr[j];
                sarr[j]=temp;
               }
            }
       }
       temp=sarr[0];//Initialize temp to first word
       for(int i=1;i<n;i++)
       {
      if(temp.equals(sarr[i]))//if any word found more than once increase counter by 1
      count++;
      else
      {
       System.out.println("Frequency of "+temp+" :"+count);
       count=1;
       temp=sarr[i];
      }
      
     
      }  
          System.out.println("Frequency of "+temp+" :"+count);
        }
    
    public static void main()throws IOException
    {   
        String str;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Paragraph:");
        str=br.readLine();
        Stringassignment4 obj=new Stringassignment4();
        obj.longestWord(str);
        obj.srtingWordAsscending(str);
        obj.freqWords(str);
        
        
    }
    
}
