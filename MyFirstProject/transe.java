import java.io.*;
class transe{
    void operation(int x[][],int a,int b)
    {   int y[][]=new int[a][b];
        int i,j;
        for(i=0;i<a;i++)
        {
            for(j=0;j<b;j++)
            {
                x[j][i]=x[i][j];
            }
        }
       
    }
    public static void main(String args[])throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of rows and col" );
        int row=Integer.parseInt(br.readLine());
        int col=Integer.parseInt(br.readLine());
        int a[][] =new int[row][col];
        int b[][]=new int[row][col];
        int i,j;
        System.out.println("Enter the matrix element");
        for(i=0;i<row;i++)
         {
             for(j=0;j<col;j++)
             {
                a[i][j]=Integer.parseInt(br.readLine()); 
             }    
         }
         System.out.println("Print the matrix element before Transepose");
        for(i=0;i<row;i++)
         {
             for(j=0;j<col;j++)
             {
               System.out.print(a[i][j]+" ");
             }    
             System.out.println();
         }
         
         transe ob=new transe();
         ob.operation(a,row,col);
         
        
        System.out.println("Print the matrix element after Transepose");
        for(i=0;i<row;i++)
         {
             for(j=0;j<col;j++)
             {
               System.out.print(a[i][j]+" ");
             }    
             System.out.println();
         }
         
          
         
    }
}