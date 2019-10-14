import java.io.*;
class validdate
{
 int days[]={31,28,31,30,31,30,31,31,30,31,30,31};
 String month[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
 
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 int d,m,y;
 public void takeDate() throws Exception
 {
  System.out.println("Enter your date of birth in dd mm yyyy format:");
  d=Integer.parseInt(br.readLine());

  m=Integer.parseInt(br.readLine());
  y=Integer.parseInt(br.readLine());
  int li;
  li=leap(y);
  if(li==1)
  days[1]=29;
 if(m<=0 || m>12)
 {
   System.out.println("INVALID MONTH");
   return;
  }
 else if(d<=0 || d>days[m-1])
 {
   System.out.println("INVALID DATE");
   return;
  }
  int val=validDate(d,m,y);
  if(val>0)
  {
  System.out.println(" VALID DATE\n"+y);
  System.out.println("Date"+d+month[m-1]+y);
  
  }
  else
  {
  System.out.println(" INVALID DATE");
  return;
  }
  }
  int validDate(int d1,int m1,int y1)
  {
  
  int li,i;
  li=leap(y);
  if(d1>days[m1-1])
  return 0;
  else
  {
   for(i=0;i< m1-1;i++)
   {
    d1=d1+days[i];
   }
    d1=d1+li;
    //System.out.print(d1);
    return d1;
  }
  }
   int leap(int y)
   {
    if(y%100==0 && y%400==0)
    return 1;
    else if(y%100!=0 && y%4==0)
    return 1;
   else
   return 0;
   }
   public static void main(String args[]) throws Exception
   {
    validdate ob=new validdate();
    ob.takeDate();
    }
    }