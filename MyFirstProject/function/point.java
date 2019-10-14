import java.io.*;
class point
{
int x,y;
point()
{
x=0;
y=0;
}
void point1()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the x coordinate");
x=Integer.parseInt(br.readLine());
System.out.println("enter the y coordinate");
y=Integer.parseInt(br.readLine());
}
point midpoint(point a,point b)
{
point c=new point();
 c.x=(a.x+b.x)/2;
 c.y=(a.y+b.y)/2;
 return c;
}
void display()
{
System.out.println(x);
System.out.println(y);
}
public static void main()throws IOException
{
point obj1=new point();
point obj2=new point();
point obj3=new point();
point obj4=new point();
obj1.point1();
obj2.point1();
obj4=obj3.midpoint(obj1,obj2);
System.out.println("midpoint is");
obj4.display();
}
}