import java .io.*;
class Magic
{
    public  void input()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter an no.");
        int n=Integer.parseInt(br.readLine());
        while(n>9)
        { 
           
           n=sumdigit(n);
            
            
        }  
            if(n==1)
            System.out.println("magic no");
            else
            System.out.println("not magic no");
            
        
        
        
        
    }
    int sumdigit(int a)
    {
        int d=0,sum=0;
        if (a==0)
        return 0;
        else
        d=a%10;
        sum=(d+sumdigit(a/10));
        return sum;
        
        
    }
    public static void main(String args[])throws IOException
    {
        Magic ob=new Magic();
       ob.input();
    }    
}

    
    
    
    
