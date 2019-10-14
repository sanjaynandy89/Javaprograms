import java.io.*;
public class Pseudoarithmatic
{
      int n,a[],ans,flag,sum,temp;
     public Pseudoarithmatic()
       {
           n=ans=flag=sum=temp=0;
           
       }  
       void accept(int nn)throws IOException
       {
           int i;
           n=nn;
           a=new int[n];
           BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
           for( i=0;i<n;i++)
           {
                 System.out.println("Enter a number"); 
                 a[i]=Integer.parseInt(br.readLine());
                 
               
           }    
           
           
       }  
       boolean check()
       {
           int i ,j;
           temp=a[0]+a[n-1];
           if(n%2==0)
           {
               
           ans=1;    
           } 
           for(i=0,j=n-1;i<n/2;i++,j--)
           {
                sum=a[i]+a[j];
                if(sum!=temp)
                {
                    flag=1;
                    break;
                }
                
            }   
                if(ans==0)
                {
                    sum=2*a[n/2];
                    if(sum!=temp)
                    {
                        flag=1;
                        
                    }
                    
                }    
             if(flag==0)
             {
                 
                 return true;
                 
                 
                }
                
                else{
                    
                    return false;
                }
           
           
        }  
        
   public static void main(String args[])throws IOException
   {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter the number of elements");
       int n=Integer.parseInt(br.readLine());
       Pseudoarithmatic ob=new Pseudoarithmatic();
       ob.accept(n);
       boolean x=ob.check();
       if(x==true)
       {
         System.out.println("Pseudo arithmatic sequence");    
           
       } 
       else
       {
          System.out.println("Not a  Pseudo arithmatic sequence"); 
           
        }    
      
   }
}
