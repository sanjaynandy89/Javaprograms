
import java.io.*;
class magicmatrix
{
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        System.out.println("enter the array size");
        int m=Integer.parseInt(br.readLine());
        int a [][]=new int[m][m];
        System.out.println("enter the array element");
        int k=1;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                
                a[i][j]=k++;
            }
            
            
        }
        System.out.println("the magic matrix");
        int b[]=new int[m*m];
        int c[]=new int[m*m];
        int x=0,y=0;
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i==j)
                
               {
                   b[x++]=a[i][j];
                   
                }
                if((i+j)==(m-1))
                {
                    c[y++]=a[i][j];
                    
                }
            }
            
            
        }
        for(int i=0;i<x;i++)
        {
            System.out.println(b[i]);
             
        }  
        for(int i=0;i<y;i++)
        {
            System.out.println(c[i]);
             
        }  
        int p=0;
        for(int i=0;i<m;i++)
        {   
            for(int j=0;j<m;j++)
            {
            if(i==j)
                
               {
                   a[i][j]=b[--x];
                   
                }
                if((i+j)==(m-1))
                {
                    a[i][j]=c[--y];
                    
                }
            }
            
        }
       for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(a[i][j]+" ");
                
                
            }
            
            System.out.println();
        }
        
    
        
        
        
    }
    
    
    
    
}