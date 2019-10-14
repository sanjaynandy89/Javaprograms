import java.io.*;
class twovaliddate
{
 int days[]={31,28,31,30,31,30,31,31,30,31,30,31};
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 int d,m,y;
 public int takeDate() throws Exception
 {
  System.out.println("Enter your date of birth in dd mm yyyy format:");
  d=Integer.parseInt(br.readLine());

  m=Integer.parseInt(br.readLine());
  y=Integer.parseInt(br.readLine());
 if(m<=0 || m>12)
 {
   System.out.println("INVALID MONTH");
   return 0;
  }
 else if(d<=0 || d>days[m])
 {
   System.out.println("INVALID DATE");
   return 0;
  }
  y=validDate(d,m,y);
  if(y>0)
  {
  return y;
  }
  else
  {
  
  return 0;
  }
  }
  int validDate(int d1,int m1,int y1)
  {
  
  int li,i;
  li=leap(y1);
  if(li==1)
  days[1]=29;
  if(d1>days[m1-1])
  return 0;
  else
  {
   for(i=0;i< m1-1;i++)
   {
    d1=d1+days[i];
   }
    d1=d1+li;
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
   public int takeDate1() throws Exception
 {
  System.out.println("Enter your date of birth in dd mm yyyy format:");
  d=Integer.parseInt(br.readLine());

  m=Integer.parseInt(br.readLine());
  y=Integer.parseInt(br.readLine());
 if(m<=0 || m>12)
 {
   System.out.println("INVALID MONTH");
   return 0;
  }
 else if(d<=0 || d>31)
 {
   System.out.println("INVALID DATE");
   return 0;
  }
  y=validDate(d,m,y);
  if(y>0)
  {
  return y;
  }
  else
  {
  
  return 0;
  }
  }
  int validDate1(int d1,int m1,int y1)
  {
  
  int li,i;
  li=leap(y1);
  if(d1>days[m1-1])
  return 0;
  else
  {
   for(i=0;i< m1-1;i++)
   {
    d1=d1+days[i];
   }
    d1=d1+li;
    return d1;
  }
  }
   int leap1(int y)
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
    twovaliddate ob=new twovaliddate();
    int x1=ob.takeDate();
    if(x1==0)
    System.out.println("inValid date");
    else
    System.out.println("valid date");
    int x2=ob.takeDate1();
    if(x2==0)
    System.out.println("inValid date");
    else
    System.out.println("valid date");
    int diff=x2-x1;
    System.out.println("difference"+diff);
    
    
    
    }
    }