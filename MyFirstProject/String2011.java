
import java.io.*;
import java .util.*;
class String2011
{
 
 public  static void main() throws Exception
 {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 String str[],s;
 int n;
  System.out.println("\nHow many sentences:");
  n=Integer.parseInt(br.readLine());
  if(n<1 || n>9)
  {
    System.out.println("\nINVALID ENTRY:");
    return;
  }
  str=new String[n];
  for(int i=0;i< n;i++)
  {
    System.out.println("\nEnter sentence ( ends with full stop):");
    s=br.readLine();
    if(s.charAt(s.length()-1)!='.')
    {
     System.out.println("\nFull stop at the end is mandatory:");
     i--;
     continue;
     }
    str[i]=s;
  }
  
  
  String2011 ob=new String2011();
  System.out.println("OUTPUT STRING");
  for(int i=0;i< n;i++)
  {
   s=str[i];
   if(i%2==0)
   ob.encrypt(s);
   else
   ob.reverse(s);
  }
}
void encrypt(String st)
{
    char chr=' ';
    int p;
   for(int i=0;i<st.length();i++)
      {
       chr=st.charAt(i);
       if((chr>='a' &&chr<='x')||(chr>='A' &&chr<='X'))
       {
           p=(int) (chr+2);
           chr=(char)(p);
       } 
       else{
       if((chr=='Z'||chr=='z') ||(chr=='Y'||chr=='y'))
       {
          
           p=(int) (chr-24);
           chr=(char)(p);
        }
    }  
         System.out.print(chr);
      
      }   
    System.out.println();
  }

void reverse(String st1)
{
StringTokenizer  st=new StringTokenizer(st1,",.? ");
int n=st.countTokens();
int index=0;
String sarr[]=new String[n];
while(st.hasMoreTokens())
{
sarr[index++]=st.nextToken();
}
   for(int i=n-1;i>=0;i--)
   {
       System.out.print(sarr[i]+" ");
   }
   System.out.print(".");
   System.out.println();
}
    
    
    
    
}