import java.io.*;
import java.util.*;
public class Stringhw6
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
    if(s.charAt(s.length()-1)!='.')
    {
     System.out.println("\nFull stop at the end is mandatory:");
     i--;
     continue;
     }
    str[i]=s;
  }
  for(i=0;i< n;i++)
  {
   s=str[i];
   if(i%2==0)
   encrypt(s);
   else
   reverse(s);
  }
  }
  public void encrypt(String s)
  {
   int i,len;
   char ch;
   String st="";
   len=s.length();
   for(i=0;i< len;i++)
   {
    ch=s.charAt(i);
    if((ch >=65 && ch <=90)||(ch >=97 && ch<=122))
    {
       ch=(char)(ch+2);
  if(ch >90 && ch< 97)
  {
   ch=(char)((64+ch-90));
   }
  else if(ch >122)
  {
   ch=(char)((96+ch-122));
   }
 }
  st=st+ch;
  }
 System.out.println(st);
 }
 public void reverse(String str)
 {
  StringTokenizer obj=new StringTokenizer(str," .");
   String s1[]=new String[20];
   int words=obj.countTokens();
    while(obj.hasMoreTokens())
    {    for(int i=1;i<=words;i++){
        
        s1[i]=obj.nextToken();
    }
    for(int i=words;i>=1;i--){
        System.out.print(s1[i]+" ");
    }
    System.out.print(".");
    System.out.println();
    }
 }


  public static void main(String args[]) throws Exception
  {
  Stringhw6 ob=new Stringhw6();
   ob.takeString();
   }
   }


