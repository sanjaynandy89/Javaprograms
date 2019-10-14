import java.io.*;
public class company
{
double inc=0;
int age;
double basic;
company()
{
String name=" ";
age=0;
basic=0;
}
void getdata()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter your name");
String name=br.readLine();
System.out.println("enter your basic salary");
 basic=Double.parseDouble(br.readLine());
System.out.println("enter  your age");
 age=Integer.parseInt(br.readLine());
}
void calculate()
{
if(age>56)
{
inc=0.2*basic;
}
else if(age>45 && age<=56)
{
inc=0.15*basic;

}
else if(age<=45)
{
inc=0.1*basic;

}
basic=basic+inc;
}
void display()
{
System.out.println("age "+age+"basic "+basic);
}
public static void main()throws IOException
{
company obj=new company();
obj.getdata();
obj.calculate();
obj.display();
}
}
