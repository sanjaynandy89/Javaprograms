
import java.io.*;
class matrix
{
public static void main(String arges[])throws IOException 
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a [][]=new int [10][10];
        System.out.println("enter row and col");
      
          int r=Integer.parseInt(br.readLine());
        
            int c=Integer.parseInt(br.readLine());
            int p=0;
            int sp=0;
            System.out.println("enter the array element");
            for(int i=0;i<r;i++)
            {for(int j=0;j<c;j++)
                {
                    a [i][j]=Integer.parseInt(br.readLine());
                    
                }
                
            }System.out.println("enter final matrix");
             for(int i=0;i<r;i++)
              {
                for(int k=0;k<sp;k++)
                {
                    
                  System.out.print("  ");    
                }  
                sp++;
                for(int j=p;j<c;j++)
              
                        {
                           
                            System.out.print(a[i][j]+" ");
                        }
                        System.out.println();
                        p++;
                
                    }
                    
                
                
                
                
                
                
                
            }
        
        }



