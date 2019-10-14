import java.io.*;
public class Stringsorting
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
     int len=str.length();
     for(int k=0;k<len;k++)
     {
         
       if(str.charAt(k)!=' '&&str.charAt(k)!='.')
       {
           temp=temp+str.charAt(k);
       }   
       else
       {
           
        s[c]=temp;
        c=c+1;
        temp="";
       }
       
    }
    System.out.println(c);
     for(int k=0;k<c;k++)
     {
         
      System.out.print(s[k]+" ");
    }
    // use Selection sort for sorting
    for(int i=0;i<c-1;i++)
    {
        for(int j=i+1;j<c;j++)
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
    for(int k=0;k<c;k++)
     {
         
       System.out.print(s[k]+" ");
       
    }
}
}
