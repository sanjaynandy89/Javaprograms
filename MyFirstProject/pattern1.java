
/**
 * Write a description of class pattern1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
public class pattern1
{
    public static void main(String args[])throws IOException{
     System.out.println("Enter a String");
     BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
     String str=br.readLine();
     int l=str.length();
     int p=l;
     int q=l;
     int a=1;
     int sp1=1;
     int sp2=2*l+1;
     int r=2;
    for(int i=1;i<=l-1;i++)
     {
         for(int j=0;j<=a;j++)
         {
             
         System.out.print(str.charAt(j)+" ");  
        }
        for(int k=sp2;k>=1;k--){
            System.out.print(" ");
            
        }
        for(int m=r;m>=1;m--){
            System.out.print(str.charAt(m-1)+" ");
        }   
        System.out.println();
        a=a+1;
        r=r+1;
        sp2=sp2-4;
    }
     }   
}
