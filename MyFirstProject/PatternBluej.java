
/**
 * Write a description of class pattern here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
public class PatternBluej
{
    public static void main(String args[])throws IOException{
     System.out.println("Enter a String");
     BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
     String str=br.readLine();
     int l=str.length();
     int p=l;
     int q=l;
     int r=2;
     int a=1;
     int sp1=1;
     int sp2;
     
     for(int i=1;i<=l;i++)
     {
         for(int j=0;j<p;j++)
         {
             
         System.out.print(str.charAt(j)+" ");  
        }
        
         if(i==1){
            for(int m=p-2;m>=0;m--)
        {
            System.out.print(str.charAt(m)+" ");
        }   
        }   
        if(i>1){
        for(int k=0;k<=sp1;k++)
        {
          System.out.print(" ");
        } 
        sp1=sp1+4;
        for(int m=q-1;m>=0;m--)
        {
            System.out.print(str.charAt(m)+" ");
        }  
        
      } 
    
    
        System.out.println();
        p=p-1;
        q=q-1;
        
           
     }
     sp2=sp1-8;
     for(int i=1;i<=l-1;i++)
     {
         for(int j=0;j<=a;j++)
         {
             
         System.out.print(str.charAt(j)+" ");  
        }
        if(i<l-1){
        for(int k=sp2;k>=0;k--){
            System.out.print(" ");
            
        }
        for(int m=r;m>=1;m--){
            System.out.print(str.charAt(m-1)+" ");
        }   
    }
        else{
            for(int m=l-2;m>=0;m--)
            {
               System.out.print(str.charAt(m)+" "); 
            }    
        }    
        System.out.println();
        a=a+1;
        r=r+1;
        sp2=sp2-4;
           
     }   
      
    }   
}
