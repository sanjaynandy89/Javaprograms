import java.io.*;
class Boundaryelement
{
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter row and column");
        int m=Integer.parseInt(br.readLine());
        int a[][]=new int[m][m];
        System.out.println("Enter the elements");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=Integer.parseInt(br.readLine());
                
                
            }
            
            
        }
        System.out.println(" the original matrix");
         for(int i=0;i<m;i++)
         {
             for(int j=0;j<m;j++)
             {
                 System.out.print(a[i][j]+" ");
                 
                 
                }
             System.out.println();
             
            }
           int b[]=new int[m*m];
           int x=0;
           for(int i=0;i<m;i++)
           {
               for(int j=0;j<m;j++)
               {if((i==0)||(j==0)||(i==m-1)||(j==m-1))
                   
                   {
                       b[x++]=a[i][j];
                  
                } 
                }
               
            }
           
            int t;
            for(int i=0;i<x;i++)
            {
                for(int j=0;j<x-i-1;j++)
                {
                    if(b[j]>b[j+1])
                    {
                       t=b[j];
                       b[j]=b[j+1];
                       b[j+1]=t;
                        
                    }
                }
                
                
                }
               
                int p=0;
                for(int i=0;i<m;i++)
                {
                    a[0][i]=b[p++];
                }
                for(int i=1;i<m;i++)
                {
                    a[i][m-1]=b[p++];
                }
                for(int i=m-2;i>=0;i--)
                {
                    a[m-1][i]=b[p++];
                }
                for(int i=m-2;i>0;i--)
                {
                    a[i][0]=b[p++];
                }
                System.out.println("Rearranged matrix");
                for(int i=0;i<m;i++)
                {
                    for (int j=0;j<m;j++)
                    {
                       System.out.print(a[i][j]+" "); 
                    }
                    System.out.println();
                }
                
                    
                }
                
                
            }
        
        
        
        

    
    
    
    
