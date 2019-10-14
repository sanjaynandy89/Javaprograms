
import java.io.*;
class Deci_oct
{
    int n;
    int oct;
    int a[]=new int[10];
    int c=0;
    Deci_oct()
    {
       n=0;
       oct=0;
       
    }
    void getnum(int nn)
    {
        
        n=nn;
        
        
    }
    void deci_oct()
    {
        int r;
        if(n>0)
        {
            r=n%8;
            n=n/8;
            deci_oct();
            oct=(10*oct)+r;
            
            
            
            
        }
        
        
        
        
    }
    void show()
    {
        System.out.println("the decimal number=" +n);
        deci_oct();
        System.out.println("The octal number is"+oct);
         }
        
        
        
    
    public static void main() throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter decimal number");
        int x=Integer.parseInt(br.readLine());
        Deci_oct ob=new Deci_oct();
        ob.getnum(x);
        ob.show();
        
        
        
        
    }

    
    
    
    
    
    
}