
/**
 * Write a description of class Merging here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
public class Merging
{   public static int a[],b[],r,s;
   
    
  
    void print(int x[],int y){
        for(int i=0;i<y;i++){
            System.out.print(" "+x[i]);
        }   
    }   
    public static void main() throws IOException
    {    BufferedReader br =new BufferedReader (new InputStreamReader(System.in));
         System.out.println("Enter the range fist array");
        r=Integer.parseInt(br.readLine());
        a=new int[r];
         System.out.println("Enter the array elements");
        for(int i=0;i<r;i++)
        a[i]=Integer.parseInt(br.readLine());
        System.out.println("Enter the range second array");
        s=Integer.parseInt(br.readLine());
        b=new int[s];
        System.out.println("Enter the array elements");
        for(int i=0;i<s;i++)
        b[i]=Integer.parseInt(br.readLine());
       // Sorting
        for(int i=0;i<r-1;i++){
         
         for(int j=0;j<(r-i-1);j++)
         {  if(a[j]>a[j+1]){
            int temp=a[j];
             a[j]=a[j+1];
             a[j+1]=temp;
            } 
             
         }
        }   
        for(int i=0;i<s-1;i++){
         
         for(int j=0;j<(s-i-1);j++)
         {   if(b[j]>b[j+1]){
             int temp=b[j];
             b[j]=b[j+1];
             b[j+1]=temp;
            }
             
         }
        }
        //MERGING
        int c[]=new int[s+r];
        int m=0,n=0,ptr=0;
        while(m<=r && n<=s)
        {
            if(a[m]<b[n])
            {
                c[ptr]=a[m];
                ptr=ptr+1;
                m=m+1;
                
            }  
            else{
                c[ptr]=b[n];
                ptr=ptr+1;
                n=n+1;
            }   
        }    
        if(m>r){
            for(int k=0;k<s-n;k++)
            {
                c[ptr+k]=b[n+k];
                
            }
        }
        else{
            for(int k=0;k<r-m;k++)
            {
                c[ptr+k]=a[m+k];
                
            }
        }
        for(int i=0;i<ptr;i++){
        System.out.print(c[i]);
    }
        
    
        
        
    }    
}
