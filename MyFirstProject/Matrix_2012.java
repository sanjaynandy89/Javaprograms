
import java.util.*;
class Matrix_2012
{
    public static void main()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the row and column");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int a[][]=new int[m][n];
        int max,min;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("enter the array elements");
                a[i][j]=sc.nextInt();
            }
            
            
        }
        System.out.println("matrix after sorting");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
                
                
                
                
            }System.out.println();
                
            
        }
        max=a[0][0];
        min=a[0][0];
        for(int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++)
            {
                if(a[i][j]>max)
                max=a[i][j];
                if(a[i][j]<min)
                min=a[i][j];
        
        
             }
        
    }System.out.println("the maximum element="+ max);
    System.out.println("the minimum element="+ min);
    int x[]=new int[m*n];
    int c=0;
    int p=m*n;
        for(int i=0;i<m;i++)
        { for(int j=0;j<n;j++)
            {
            
           
            x[c++]=a[i][j];
            
        }
        }
       
        for(int i=0;i<p;i++)
        {
            
            for(int j=0;j<(p-i-1);j++)
            {   if(x[j]>x[j+1])
                {
                int temp=x[j];
                x[j]=x[j+1];
                x[j+1]=temp;
            }
         
            }
            
        }
        int c1=0;
        
        for(int i=0;i<m;i++)
        { for(int j=0;j<n;j++)
            {
            
           
            a[i][j]=x[c1++];
            
        }
        }
        System.out.println("Matrix in after sort:");
         for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
                
                
                
                
            }System.out.println();
                
            
        }
        
    }     
        
    }