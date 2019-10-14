
import java.io.*;
class stock
{
    String item;
    double qty;
    double rate;
    double amt;
    stock(String a,double b,double c)
    {
        item=a;
        qty=b;
        rate=c;
     
        
        
        
    }
    void display()
    {
        System.out.println("name of the item="+item);
        System.out.println("qyantity of the item in stock="+qty);
        System.out.println("unit price of an item="+rate);
        System.out.println("net value  of the item in stock="+amt);
        
        
        
        
        
    }
    
    
    
    
    
}
class PURCHASE extends stock
{
    double pqty;
    double prate;
    PURCHASE(String a,double b,double c,double d,double e)
    {
        super (a,b,c);
        pqty=d;
        prate=e;
    }
    void update()
    {
        qty+=pqty;
        if(rate!=prate)
        rate=prate;
        amt=rate*qty;
        
    }
    void display()
    {
        super.display();
        update();
        super.display();
        
        
    }
        
       public static void main(String args[])throws IOException
       {  
           BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
           System.out.println("Enter the name");
           String str=br.readLine();
           System.out.println("Enter the quantity");
           double qty=Double.parseDouble(br.readLine());
           System.out.println("Enter the rate");
           double rate=Double.parseDouble(br.readLine());
           System.out.println("Enter the  puchase quantity");
           double pqty=Double.parseDouble(br.readLine());
           System.out.println("Enter the  puchase rate");
           double prate=Double.parseDouble(br.readLine());
           PURCHASE ob=new PURCHASE(str,qty,rate,pqty,prate);
           ob.display();
           
       }    
        
        
    }
    
    
    
    
    
