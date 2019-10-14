import java.io.*;
class Array1
{
int arr[]={ 31,28,31,30,31,30,31,31,30,31,30,31};
int d1=-1,m1=-1,y1,d2=-1,m2=-1,y2,days=0,mon1,mon2;
int i,j;
String str,start,end;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
public void take() throws IOException
{
 System.out.print("Enter the start date in dd/mm/yyyy format:");
 start=br.readLine();
  System.out.print("Enter the end date in dd/mm/yyyy format:");
 end=br.readLine();
while(true)
{
 i=start.indexOf("/");
 if(i< 0)
 break;
 str=start.substring(0,i);
 if(d1==-1)
 d1=Integer.parseInt(str);
 else if(m1==-1)
 m1=Integer.parseInt(str);
 start=start.substring(i+1);
}
y1=Integer.parseInt(start);
while(true)
{
 i=end.indexOf("/");
 if(i< 0)
 break;
 str=end.substring(0,i);
 if(d2==-1)
 d2=Integer.parseInt(str);
 else if(m2==-1)
 m2=Integer.parseInt(str);
 end=end.substring(i+1);
}
y2=Integer.parseInt(end);
days=arr[m1-1]-d1;
days=days+d2;
m2=m2-1;
mon2=m2;
for(i=y1;i<=y2;i++)
{
 if(i!=y1)
 m1=0;
 if(i!=y2)
m2=12;
else if(i==y2)
m2=mon2;
for(j=m1;j< m2;j++)
{
days=days+arr[j];
}
if(leap(i) && m2>2)
days++;
}
System.out.println("Total number of days="+days);
}
 private boolean leap(int yyyy)
 {
      if(yyyy%100==0 && yyyy%400==0)
      return true;
      else if(yyyy%100!=0 && yyyy%4==0)
      return true;
      else
      return false;
    }
  public static void main(String args[]) throws Exception
{
 Array1 ob=new Array1();
 ob.take();
}
}