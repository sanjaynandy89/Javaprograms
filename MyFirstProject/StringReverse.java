import java.io.*;
import java.util.*;
public class StringReverse
{
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 String str[],s;
 int i,n;
 public void takeString() throws Exception
 {
  System.out.println("\nHow many sentences:");
  n=Integer.parseInt(br.readLine());
  if(n<1 || n>9)
  {
    System.out.println("\nINVALID ENTRY:");
    return;
  }
  str=new String[n];
  for(i=0;i< n;i++)
  {
    System.out.println("\nEnter sentence ( ends with full stop):");
    s=br.readLine().trim();
    if(s.charAt(s.length()-1)!='.')//Check whether each sentence with ends with fullstop  
    {
     System.out.println("\nFull stop at the end is mandatory:");
     i--;
     continue;
     }
    str[i]=s;//store every String in array
  }
  for(i=0;i< n;i++)
  {
   s=str[i];//extract String 
   reverse(s);//call reverse
  }
}
  public void reverse(String str)
 {
  StringTokenizer obj=new StringTokenizer(str," .");
   String s1[]=new String[20];
   int words=obj.countTokens();//count number of words
    while(obj.hasMoreTokens())
    {    for(int i=1;i<=words;i++){
        
        s1[i]=obj.nextToken();//store each word in the array
    }
    for(int i=words;i>=1;i--){
        System.out.print(s1[i]+" ");//display the words in reverse order
    }
    System.out.print(".");
    System.out.println();
    }
 }
 public static void main(String args[]) throws Exception
  {
  StringReverse ob=new StringReverse();
   ob.takeString();
   }
   }
