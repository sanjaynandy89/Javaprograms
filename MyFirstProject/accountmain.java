import java.io.*;
class simple extends account
{
  
     double rate;
     int time;
     double si;
    simple(int accountnumber,double principal ,double rate,int time)
    {
        super(accountnumber,principal);
        this.rate=rate;
        this.time=time;
        
    } 
    double interest()
    {
      si=(principal*rate*time)/100;
      return si;
    }  
    void display2()
    {
        display1();   
        double s=interest();
      System.out.println("Rate"+rate); 
      System.out.println("Time"+time); 
      System.out.println("Interest"+s); 
      }    
}
class compound extends account
{
  
     double rate;
     int time;
     double ci;
    compound(int accountnumber,double principal ,double rate,int time)
    {
        super(accountnumber,principal);
        this.rate=rate;
        this.time=time;
        
    } 
    double interest()
    {
      ci=principal*Math.pow(((1+(rate/100))),time)-principal;
      return ci;
    }  
    void display3()
    {
        display1();
        double c=interest();
      System.out.println("Rate"+rate); 
      System.out.println("Time"+time); 
      System.out.println("Interest"+c); 
      }    
}
public class accountmain
{
    public static void main(String args[])
    {
     simple ob=new simple(1234,5000,8,5);
     compound ob1=new compound(1235,10000,8,5);
     ob.interest();
     ob.display2();
     ob1.interest();
     ob1.display3();
        
    }    
}
