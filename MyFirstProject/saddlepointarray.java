
/**
 * Write a description of class saddlepointarray here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
public class saddlepointarray
{
    public static void main(int r,int c)throws IOException
    {
     
        int i,j,k,max=0,min=0,row=0,col=0,flag=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a[][]=new int[r][c];
        System.out.println("Enter the array ");
        for(i=0;i<r;i++){
            for(j=0;j<c;j++)
            {
                a[i][j]=Integer.parseInt(br.readLine());
            }
        }
        for(i=0;i<r;i++)
        {
          min=a[i][0];
         for(j=0;j<c;j++)
          {
           if(a[i][j]<=min)
            {
             min=a[i][j];
             col=j;
            }
           }
          max=a[0][col];
         for(k=0;k<r;k++)
         {
         if(a[k][col]>=max)
         {
          max=a[k][col];
          row=k;
         }
         }
          if(max==min){
         System.out.println("sadle point is at row"+(row+1)+ "col"+ (col+1)+a[row][col]);
         flag=1;
         break;}
         
         }
         if(flag==0)
         {
             System.out.println("Saddle point not present");
         }
       
        
}
        
        
    }

