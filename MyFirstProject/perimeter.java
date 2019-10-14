
import java.io.*;
class perimeter
{
    double a;
    double b;
    perimeter(double a1,double b1)
    {
        a=a1;
        b=b1;
        
    }
    double calculate()
    {
        double p=2*(a+b);
        return p;
    }
    
    void show()
    {
        System.out.println("length="+a);
        System.out.println("breadth="+b);
        System.out.println("perimeter="+calculate());
        
        
        
        
    }
}
class area extends perimeter
{
    double h;
    area(double x1,double y1,double h1)
    {
       
        super(x1,y1);
        h=h1;
        
    }
    void doArea()
    {
        double area;
        area=b*h;
        System.out.println("The area is"+area);
   }
   void show()
   {
       super.show();
       doArea();
       
       
  } 
public static void main() throws IOException
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("enter length ,breadth & height");
    
    double l=Double.parseDouble(br.readLine());
    double b=Double.parseDouble(br.readLine());
    double h=Double.parseDouble(br.readLine());
    area ob=new area(l,b,h);
    ob.show();
    
   
    
    
    
    
}
}
  