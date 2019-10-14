import java.io.*;
class Complex
{
    int a;
    int b;
    int r;
    int c;
    Complex()
    {
        a=0;
        b=0;
        
    }
    
    Complex(int a1,int b1)
    {
       a=a1;
       b=b1;
        
    }
    void addition(Complex ob1,Complex ob2)
    {
        r=ob1.a+ob2.a;
        c=ob1.b+ob2.b;
        System.out.print("addition"+r+"+"+c+"i");
        
        
    }
    void substraction(Complex ob1,Complex ob2)
    {
        r=ob1.a-ob2.a;
        c=ob1.b-ob2.b;
        System.out.print("substraction"+r+"+"+c+"i");
        
    }
    void multiplication(Complex ob1,Complex ob2)
    {
        r=ob1.a*ob2.a-ob1.b*ob2.b;
        c=(ob1.b*ob2.a+ob1.a*ob2.b);
        System.out.print("multiplication"+r+"+"+c+"i");
    }
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
        System.out.println("enter First");
        int x=Integer.parseInt(br.readLine());
        int y=Integer.parseInt(br.readLine());
         System.out.println("enter Second");
        int p=Integer.parseInt(br.readLine());
        int q=Integer.parseInt(br.readLine());
        Complex ob1=new Complex(x,y); 
        Complex ob2=new Complex(p,q);
         Complex ob3=new Complex();
         ob3.addition(ob1,ob2);
         ob3.substraction(ob1,ob2);
         ob3.multiplication(ob1,ob2);
        
        
        
        
    }
    
}