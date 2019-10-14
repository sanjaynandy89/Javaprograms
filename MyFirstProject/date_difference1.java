import java.io.*;
class date_difference1
{
static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int month[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
int d,m, y;
date_difference1(){//Default Constructor
}
date_difference1(int d,int m,int y){//Parameterized  Constructor
    this.d=d;
    this.m=m;
    this.y=y;
    }
 
boolean isLeap(int y)
{
if((y%400==0) || ((y%100!=0)&&(y%4==0)))
return true;
else
return false;
}
 
boolean dateValidate()
{
if(d>0&&d<=month[m] && m>0&&m<=12 && y>0&&y<=9999)
return true;
else
return false;
}
 
int dayno(date_difference1 Object)//Passing Object as a reference type
{
int dn=0;
for(int i=1;i<Object.m;i++)
{
dn=dn+month[i];
}
dn=dn+Object.d;
for(int i=1;i<Object.y;i++)
{
if(isLeap(i)==true)
dn=dn+366;
else
dn=dn+365;
}
return dn;
}
 
public static void main()throws IOException
{


System.out.print("Enter the 1st date in (dd/mm/yyyy) format: ");

int d1=Integer.parseInt(br.readLine());
int m1=Integer.parseInt(br.readLine());
int y1=Integer.parseInt(br.readLine());
System.out.print("Enter the 2nd date in (dd/mm/yyyy) format: ");
int d2=Integer.parseInt(br.readLine());
int m2=Integer.parseInt(br.readLine());
int y2=Integer.parseInt(br.readLine());
date_difference1 ob1=new date_difference1(d1,m1,y1);
date_difference1 ob2=new date_difference1(d2,m2,y2);
date_difference1 ob3=new date_difference1();
if(ob1.dateValidate()==true && ob2.dateValidate()==true)
{
int a=ob3.dayno(ob1);
int b=ob3.dayno(ob2);
System.out.print("Output : Difference of days = "+Math.abs(a-b));
}
else
System.out.println("Invalid Date");
}
}


