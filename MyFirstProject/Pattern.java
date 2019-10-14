
/**
 * Write a description of class Pattern here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
public class Pattern
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
     for(int i=1;i<=l;i++)
     {
          if(i==1){
            for(int m=p-2;m>=0;m--)
        {
            System.out.print(str.charAt(m)+" ");
        }   
        }   
        if(i>1){
        for(int k=1;k<=sp1;k++)
        {
          System.out.print(" ");
        } 
        sp1=sp1+2;
        for(int m=q-1;m>=0;m--)
        {
            System.out.print(str.charAt(m)+" ");
        }  
        
      } 
    
        System.out.println();
        p=p-1;
        q=q-1;
        
    }
           
     }  
}
