import java.util.*;
class compositematrix
{
    int arr[][];
    int m;
    int n;
   compositematrix(int mm,int nn)
    {
        m=mm;
        n=nn;
        arr=new int[m][n];
        
        
    }
    
    int iscomposite(int p)
    {
        int count=0;
        for(int i=1;i<=p;i++)
         {
             if(p%i==0)
             count++;
         }
        
        if(count>2)
        return  1;
        else
        return 0;
   }
    void fill()
   {
       
        int p=1;
         int flag=0;
         int count=0;
         int a[]=new int[20];
         int q=0;
         int x=0;
         while(count<m*n)
         {
            flag=iscomposite(p);
            if(flag==1)
            {
                
                a[count++]=p++;
            }  
            System.out.print(a[x++]);
          }    
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                
                arr[i][j]=a[q++];
                
                
            }
        
        }
    }
    
    void display()
    {
        
         
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
              System.out.print(arr[i][j]);  
            }
            System.out.println();


            
      }
        
        
        
    }
    
   public static void main(String args[])
   {    Scanner sc=new Scanner(System.in);
       System.out.println("Enter the row and col"); 
       int row=sc.nextInt();
       int col=sc.nextInt();
       
       compositematrix ob=new compositematrix(row,col);
       
       ob.fill();
       ob.display();
    }
}
    
    
    
    