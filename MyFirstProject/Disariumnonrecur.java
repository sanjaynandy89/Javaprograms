
/**
 * Write a description of class Disariumnonrecur here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
public class Disariumnonrecur
{
  


    int count=0;
    void input()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter no");
        int n=Integer.parseInt(br.readLine());
        int sum=0;
        int p=n;
        int q=n;
        int d;
        while(n>0)
        {
            int r=n%10;
            count++;
            n=n/10;
           
            
        }
        while(p>0)
        {
             
         d=p%10;
         sum=sum+(int)Math.pow(d,count--);
         p=p/10;
        }
        if(q==sum)
        System.out.println("disarium no");
        else 
         System.out.println("not disarium no");
        
       
        
    }
    public static void main()throws IOException
    {
        Disarium ob=new Disarium();
        ob.input();
       
        
        
        
    }
    
}  

