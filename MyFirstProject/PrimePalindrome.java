
import java.io.*;
public class PrimePalindrome
{
    int prime(int n)
    {       int count =0;
           for(int i=1;i<=n;i++)
           {  
               
               if(n%i==0)
               count++;
               
               
            }
            if(count==2)
            return 1;
            else 
            return 0;
        
        
    }  
    int palindrome(int n)
    {
        int d,rev,num;
        num=n;
        rev=0;
        while(num!=0)
        {
            d=num%10;
            rev=rev*10+d;
            num=num/10;
            
            
        }    
        if(rev==n)
        return 1;
        else 
        return 0;
        
        
    }   
    
    public static void main(String args[])throws IOException
    {
        PrimePalindrome ob=new PrimePalindrome();
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the range");
        int p=Integer.parseInt(br.readLine());
        int q=Integer.parseInt(br.readLine());
        int count=0;
        System.out.println("Prime palindrome numbers are");
        for(int i=p;i<=q;i++)
        {
            if(ob.prime(i)==1 &&ob.palindrome(i)==1)
            {
                System.out.println(i);
                count++;
                
            }    
            
        }
        System.out.println("Frequency of prime palindrome number"+count);
        
        
    }     
}
