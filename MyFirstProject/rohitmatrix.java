
import java.io.*;
class rohitmatrix
{
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter row and column");
        int m=Integer.parseInt(br.readLine());
        int a[][]=new int[m][m];
        if(m<3||m>10)
        {
            System.out.println("invalid output");
            
        }
        else
        {
            
            System.out.println("matrix elements");
            for(int i=0;i<m;i++)
            {
               for(int j=0;j<m;j++)
               {
                   a[i][j]=Integer.parseInt(br.readLine());
                   
                }
            }  
            System.out.println("the original matrix");
                for(int i=0;i<m;i++)
            {
                 for(int j=0;j<m;j++)
               {
                   System.out.print(a[i][j]+"  ");
                

                
                }
                System.out.println();
            }
            
            {
                int b[]=new int[m*m];
                int x=0;
                for(int i=1;i<m-1;i++)
                {
                    for(int j=1;j<m-1;j++)
                    {
                        b[x++]=a[i][j];
                    }
                    
                }
                for(int i=0;i<x;i++)
                {
                    System.out.print(b[i]);
                }
                System.out.println();
                int t;
                for( int i=0;i<x;i++)
                {
                    for( int j=0;j<x-i-1;j++)
                    {
                        if(b[j]>b[j+1])
                        {
                            t=b[j];
                            b[j]=b[j+1];
                            b[j+1]=t;
                            
                        }
                        
                     }
                    
                }
                for(int i=0;i<x;i++)
                {
                    System.out.print(b[i]);
                }
                System.out.println();
                int y=0;
                for(int i=1;i<m-1;i++)
                {
                    for(int j=1;j<m-1;j++)
                    {
                        a[i][j]=b[y++];
                        
                    }
                    
                    
                }
                System.out.println("the rearranged matix");
                for(int i=0;i<m;i++)
                {
                    for(int j=0;j<m;j++)
                    {
                        System.out.print(a[i][j]+"  ");
                    }
                    System.out.println();
                    
                }
            
                
            }

        }
        int sum=0;int sum1=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
               if(i==j || (i+j)==m-1)
                {
                    System.out.print(a[i][j]+"\t");
                    sum = sum + a[i][j];
                }
                else
                    System.out.print("\t");
                    
            
        }
        System.out.println();
        

    }
    System.out.println();
    
}
}
