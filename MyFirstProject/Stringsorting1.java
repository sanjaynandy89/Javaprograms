import java.io.*;
import java.util.*;
public class Stringsorting1
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
     StringTokenizer obj=new StringTokenizer(str);//Initialize tokens
     int words=obj.countTokens();//counts the number of tokens
    
     if(words>5){
         System.out.println("Sentence more than five words");//if  sentence have more than five words
        } 
    else{
     for(int k=0;k<words;k++)
     {
         
        s[k]=obj.nextToken();//stores the tokens in array s[]
        
       
    }
     System.out.println(" Sentence before sort");//print the sentence before sorting
    
    for(int k=0;k<words;k++)
     {
         
       System.out.print(s[k]+" ");
     
      
       
    }
    // use Selection sort for sorting
    for(int i=0;i<words-1;i++)
    {
        for(int j=i+1;j<words;j++)
        {
          if(s[i].length()>s[j].length())//sorts the string according to the number of characters in a word
          {
               temp=s[i];
               s[i]=s[j];
               s[j]=temp;
          }   
         if(s[i].length()==s[j].length())//if the number of characters are same the sort alphabetically
          {
            if(s[i].compareTo(s[j])>0)  
            {
              temp=s[i];
              s[i]=s[j];
              s[j]=temp;
            }    
          }    
        }
    }
    System.out.println("\n Sentence after sort");//print the sentence after sort
    for(int k=0;k<words;k++)
     {
         
       System.out.print(s[k]+" ");
       
    }
}
}
}