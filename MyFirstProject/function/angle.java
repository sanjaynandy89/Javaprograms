import java.io.*;
class angle
{
    int deg,min;
    
    angle()
    {
    deg=0;
    min=0;
}
void readangle()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter degree");
deg=Integer.parseInt(br.readLine());
System.out.println("enter minutes");
min=Integer.parseInt(br.readLine());
}
angle sumangle(angle a,angle b)
{
int x=a.deg*60+a.min;
int y=b.deg*60+b.min;
int z=x+y;
angle c=new angle();
c.deg=z/60;
c.min=z%60;
return c;
}
void dispangle()
{
System.out.println(deg);
System.out.println(min);
}
public static void main()throws IOException
{
angle obj1=new angle();
angle obj2=new angle();
angle obj3=new angle();
angle obj4=new angle();
obj1.readangle();
obj2.readangle();
obj4=obj3.sumangle(obj1,obj2);
System.out.println("The first angle is ");
obj1.dispangle();
System.out.println("The second angle is ");
obj2.dispangle();
System.out.println("The sum angle is ");
obj4.dispangle();

}
}