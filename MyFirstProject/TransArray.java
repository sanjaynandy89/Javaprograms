import java.io.*;
class TransArray
{
    
    int arr[][];
    int m;
    int n;
    TransArray()
    {
        m=0;
        n=0;
        
        
        
    }
   TransArray(int mm,int nn)
   {
       m=mm;
       n=nn;
       arr=new int[m][n];
       
       
       
    }
    void fillArray()throws IOException
    {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
               arr[i][j]=Integer.parseInt(br.readLine()); 
            }
            
            
            
        }
        
        
        
        
        
    }
    
 
    void transepose(TransArray A)
    {
        int arr1[][]=new int[m][n];
 
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr1[j][i]=A.arr[i][j];
            }
        }
    
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
               System.out.print(arr1[i][j]);
            }
            System.out.println();
    
        
        }  
        
    }
    void dispArray()
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
    public static void main(String args[]) throws IOException
    {   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the row and column");
        int m=Integer.parseInt(br.readLine());
        
        int n=Integer.parseInt(br.readLine());
        TransArray ob=new TransArray(m,n);
        System.out.println("Input matrix");
        ob.fillArray();
        System.out.println("The Matrix is");
        ob.dispArray();
        System.out.println("Matrix after transepose");
        ob.transepose(ob);
       
    }
    
}
    
    
    
    