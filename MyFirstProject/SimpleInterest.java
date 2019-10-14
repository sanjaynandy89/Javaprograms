import java.io.*;
public class SimpleInterest
{ 
  public static void main(String args[])throws IOException
  {
      float p,r,i,amt;
      int t;
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the principal, rate and time");
      p=Float.parseFloat(br.readLine());
      r=Float.parseFloat(br.readLine());
      t=Integer.parseInt(br.readLine());
      i=p*r*t/100;
      amt=p+i;
      System.out.println("Interest and Amount is"+i+""+amt);
      System.out.print("Interest is"+i);
      System.out.println("Amount is"+amt);
      
    
  }     
}
