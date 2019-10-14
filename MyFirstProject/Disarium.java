
import java.io.*;
class Disarium

{
    int count=0;
    void input()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter no");
        int n=Integer.parseInt(br.readLine());
        int sum=0;
        int p=n;
        while(n>0)
        {
            int r=n%10;
            count++;
            n=n/10;
           
            
        }
        
         sum=sumdigit(p);
         
        if(p==sum)
        System.out.println("disarium no");
        else 
         System.out.println("not disarium no");
        
       
        
    }int sumdigit(int x)
    {
        int d;
    if(x==0)
    return 0;
    else
    d=x%10;
    return((int)Math.pow(d,count--)+sumdigit(x/10));
    }
    public static void main()throws IOException
    {
        Disarium ob=new Disarium();
        ob.input();
       
        
        
        
    }
    
}