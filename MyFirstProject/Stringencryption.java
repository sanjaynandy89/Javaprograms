import java.io.*;

public class Stringencryption
{
  public static void main()throws IOException
  { 
      String str="";
      char chr=' ';
      int p;
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the word");
      str=br.readLine();
      for(int i=0;i<str.length();i++)
      {
       chr=str.charAt(i);
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
}
