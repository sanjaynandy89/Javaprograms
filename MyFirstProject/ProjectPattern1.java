
/**
 * Write a description of class ProjectPattern1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 * 

 */
import java.util.*;
public class ProjectPattern1
{
public static void main(String args[])
{    
Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n=sc.nextInt();
        int sp1=n/2-1;
        int p=n/2;
        int sp2=0;
        int q=n/2;
       
        for(int i=1;i<=n/2;i++)
        {
            
            for(int l=1;l<=p;l++)
            {
              System.out.print("*");   
            }
            for(int m=1;m<=sp2;m++)
            { 
                System.out.print(" ");
            }
            for(int m=1;m<=sp2;m++)
            { 
                System.out.print(" ");
            } for(int o=1;o<=q;o++)
            {
              System.out.print("*");
            } 
            
            
            sp1=sp1-1;
            p=p-1;
            sp2=sp2+1;
            q=q-1;
           
            System.out.println();
        } 
        int x=2;
        int sp3=n/2-2;
        for(int i=(n/2+2);i<=n;i++)
        {
            for(int j=1;j<=x;j++)
            {
                System.out.print("*");
                
            } 
            for(int k=1;k<=sp3;k++)
            {
                System.out.print(" ");
            } 
            for(int k=1;k<=sp3;k++)
            {
                System.out.print(" ");
            } 
             for(int j=1;j<=x;j++)
            {
                System.out.print("*");
                
            } 
            sp3=sp3-1;
            x=x+1;
            System.out.println();
        }    
        
    }   
}
