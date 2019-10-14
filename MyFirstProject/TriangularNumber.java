
/**
 * Write a description of class TriangularNumber here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
public class TriangularNumber
{
    public static void main()throws IOException
    {
     System.out.println("Enter a the number");
     BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
     int n=Integer.parseInt(br.readLine());  
     int c=2;
     int sum=0;
     int temp=0;
     
     for(int i=1;i<=n;i++){
         for(int j=1;j<=c;j++)
         {
            sum=sum+j;
         }    
         c=c+1;
         if(sum==n){
         temp=1;
         break;
        }
         sum=0;
        }  
        if(temp==1)
        System.out.println("Triangular Number");    
        else
        System.out.println(" Not a Triangular Number");    
    }    
}
