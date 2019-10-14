
import java.util.*;
public class Bubble2D
{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a[][]=new int[4][4];
    int x[]=new int[100];
     int k=0,l=0; 
    System.out.println("enter row and column");
    int row=sc.nextInt();
    int col=sc.nextInt();
    System.out.println("Enter the Elements ");
    for(int i=0;i<row;i++)
    {
        
        for(int j=0;j<col;j++)
        {
            
            a[i][j]=sc.nextInt();
            
            
        }
    }    
    System.out.println(" Elements  Are");
    for(int i=0;i<row;i++)
    {
        
        for(int j=0;j<col;j++)
        {
            
            System.out.print("   "+a[i][j]);
            
            
        }
        System.out.println();
    }  


for(int i=0;i<row;i++)
    {
        
        for(int j=0;j<col;j++)
        {
           
            x[k++]=a[i][j];
            
        }
       
    }  

for(int i=0;i<k;i++)
    {
        
        for(int j=0;j<(k-i-1);j++)
        {
           
           if(x[j]>x[j+1])
           {
               
               
               int temp=x[j];
               x[j]=x[j+1];
               x[j+1]=temp;
            
           }
       
         } 
    }
     for(int i=0;i<row;i++)
    {
        
        for(int j=0;j<col;j++)
        {
           
            a[i][j]=x[l++];
            
        }
       
    }  
    System.out.println(" Elements  After sorting");
    for(int i=0;i<row;i++)
    {
        
        for(int j=0;j<col;j++)
        {
            
            System.out.print("   "+a[i][j]);
            
            
        }
        System.out.println();
    }  

    
}
}
