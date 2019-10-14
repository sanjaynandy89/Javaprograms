
import java .io.*;
    class matrixmul
    {
    public static void main(String args[])throws IOException{    
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int a[][]=new int[3][3];
    int b[][]=new int[3][3];  
    int c[][]=new int[3][3]; 
    System.out.println("Enter the row and col for matrix 1");
    int r1=Integer.parseInt(br.readLine());
    int c1=Integer.parseInt(br.readLine());
     System.out.println("Enter the row and col for matrix 2");
    int r2=Integer.parseInt(br.readLine());
    int c2=Integer.parseInt(br.readLine());
    System.out.println("enter  elements for matrix 1");
    for(int i=0;i<r1;i++)
    {
        for(int j=0;j<c1;j++)
        {
            

            
        }  
    }
       System.out.println(" enter elements for mtrix 2"); 
    for(int i=0;i<r2;i++)
        {for(int j=0;j<c2;j++)   
            
            {
               b[i][j]=Integer.parseInt(br.readLine()); 
            }
            
            
        }
        
         System.out.println("enter  elements matrix 1 are");
    for(int i=0;i<r1;i++)
    {
        for(int j=0;j<c1;j++)
        {
            
            System.out.print(a[i][j]+" ");
            
        }  
        System.out.println();
    }
       System.out.println(" enter elements for mtrix 2"); 
    for(int i=0;i<r2;i++)
        {for(int j=0;j<c2;j++)   
            
            {
                 System.out.print(b[i][j]+" ");
            }
               System.out.println();
            
            }
    int sum=0;
    System.out.println("the product matrix");
      for(int i=0;i<r1;i++)
    {
        for(int j=0;j<c2;j++)
        { 
            for(int k=0;k<r1;k++)
            {
                sum=sum+a[i][k]*b[k][j];
           
                

                
                
                
            }
        c[i][j]=sum;
        sum=0;
        } 
    }
    
    System.out.println(" enter elements resut mtrix "); 
    for(int i=0;i<r1;i++)
        {for(int j=0;j<c2;j++)   
            
            {
                 System.out.print(c[i][j]+" ");
            }
               System.out.println();
            
            }
    
 
}
}
