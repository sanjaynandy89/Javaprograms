import java.io.*;
class Evilnumber
{
    public static void main()throws IOException
    {
      BufferedReader  br=new BufferedReader(new InputStreamReader(System.in));
      System.out.println(" enter a no.");
      int n=Integer.parseInt(br.readLine());
      int k=0,count=0;
      int a[]=new int [100];
      while(n>0)
      {
         int m=n%2;
         a[k++]=m;
         n=n/2;
          
          
          
      }
      System.out.println("Binary Equivalent");
      for(int i=k-1;i>=0;i--)
      {
          
        System.out.print(a[i]); 
        if(a[i]==1)
        count++;
          
          
     }
     System.out.println();
     if(count%2==0)
     System.out.println("Evil Number");
     else 
     System.out.println("Not a evil Number");
    
     
      
      
      
      
      
      
      
        
        
        
        
    }
    
    
    
    
    
    
    
}