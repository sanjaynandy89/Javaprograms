
import java.io.*;
public class CI2
{
    public static void main(String args[])throws IOException
    {
    double  p,r,i,amt;
    int t;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
    System.out.println("Enter principal,rate,time");
    p=Double.parseDouble(br.readLine());
    r=Double.parseDouble(br.readLine());
    t=Integer.parseInt(br.readLine());
    amt=p*Math.pow((1+(r/100)),t);
    i=amt-p;
    System.out.println("Interest and Amount is"+i+" "+amt);
    
    
}
}
