import java.io.*;
public class Rearrange
{
   public static void main(String args[])throws IOException
   {
     BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
     int i,n,max,mid,j;
     int index,temp;
     double p;
     int a[]=new int[50];
     int c[]=new int[50];
     System.out.println("Enter the size array");
     n=Integer.parseInt(br.readLine());
     while(n<1&&n>50)
     {
        System.out.println("Invalid value");
        System.out.println("Reenter the size of the array");
        n=Integer.parseInt(br.readLine());
     }
     System.out.println("Enter the numbers in the array");
     for(i=0;i<n;i++)
     {
         
     a[i]=Integer.parseInt(br.readLine());    
     } 
     max=0;
     for(i=0;i<n;i++)
     if(a[max]<a[i])
     max=i;
     mid=(n/2)-1+(n%2);
     for(i=1;i<n;i++)
     {
        p=mid+Math.pow(-1,i)*(i/2);
        index=(int)p;
        temp=a[index];
        a[index]=a[max];
        a[max]=temp;
        max=index;
        temp=0;
        for(j=1;j<n;j++)
          if(a[j]>a[temp]&&a[j]<a[max])  
          temp=j;
          max=temp;
               
         
         
         
     }  
     System.out.println("The rearrange elements of the array");
     for(j=0;j<n;j++)
     {
       System.out.println(a[j]+" ");    
         
         
     }    
     
       
   }
}
