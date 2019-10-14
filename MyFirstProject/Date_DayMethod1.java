import java.io.*;
class Date_DayMethod1
{
public static void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int days[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
String month[]={"","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
 
System.out.print("Enter the date in (dd/mm/yyyy) format: ");
String date=br.readLine().trim();
int p=date.indexOf("/");
int d=Integer.parseInt(date.substring(0,p));
int q=date.lastIndexOf("/");
int m=Integer.parseInt(date.substring(p+1,q));
int y=Integer.parseInt(date.substring(q+1));
 
if((y%400==0) || ((y%100!=0)&&(y%4==0)))     //condition for leap year
days[2]=29;
 
if(d>0&&d<=days[m] && m>0&&m<=12 && y>0&&y<=9999)     //Conditions for date to be valid
{
/* Calculating the Day number in the year, of the given date */
int dn=0;
for(int i=1;i<m;i++)
{
dn=dn+days[i];
}
dn=dn+d;
 
System.out.print("Enter the Day on 1st January in this year: ");
String s=br.readLine().trim();
//finding the day of the week which corresponds to the given day name
int x=0;
for(int i=1;i<=7;i++)
{
if (s.equalsIgnoreCase(month[i]))
x=i;
}
// the main calculation of finding the name of the day of the week of the given date starts here
for(int i=1;i<dn;i++)
{
x++;
if(x==8)
x=1;
}
 
System.out.print("Output : "+date+" is a "+month[x]);
}
else
System.out.println("Invalid Date");
}
}


