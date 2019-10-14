import java.io.*;

public class decrypt
{
    public static void main(String args[])throws IOException
    {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the String");
      String a=br.readLine();
      a=a+" ";
      String b="";
      System.out.println("Enter the shift value");
      int m=Integer.parseInt(br.readLine());
      int x,y;
      int l=a.length();
      for(int i=0;i<l;i++){
      char ch=a.charAt(i);
      char ch1=a.charAt(i);
      x=(int) ch;
      y=(int) ch1;
      
      if(x>=65 && x<=90)
      {
      x=x+(m-1);
      y=y+(m-1);  
      if(x>90)
      {
          x=x-26;
          y=y-26;
       
        }
        if(x==81 && y==81)
      {
          b=b+" ";
          i++;
          
      }
      else
      {
        b=b+(char) x; 
      } 
    }
}
    System.out.print(b);
      
    }}
