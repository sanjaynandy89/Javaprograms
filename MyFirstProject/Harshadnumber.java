import java.io.*;
class Harshadnumber
{
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" enter a no.");
        int n=Integer.parseInt(br.readLine());
        Harshadnumber ob=new Harshadnumber();
        int s=0;
        s=ob.sum(n);
        if(n%s==0)
        System.out.println("Harshadnumbr");
        else
        System.out.println("not harshadnumber");
        
     
        
    }
    int sum(int m)
    {
        int sum=0,r;
        if(m==0)
        return 0;
        else
         r=m%10;
        return (r+sum(m/10));
        
        
    }
    
    
    
}