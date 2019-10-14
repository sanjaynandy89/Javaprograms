import java.io.*;
class validdate
{
 int days[]={31,28,31,30,31,30,31,31,30,31,30,31};
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 int d,m,y;
 public void takeDate() throws Exception
 {
  System.out.println("Enter the  date  in dd mm yyyy format:");
  d=Integer.parseInt(br.readLine());

  m=Integer.parseInt(br.readLine());
  y=Integer.parseInt(br.readLine());
 if(m<=0 || m>12)
 {
   System.out.println("INVALID DATE");
   return;
  }
 else if(d<=0 || d>31)
 {
   System.out.println("INVALID DATE");
   return;
  }
  y=validDate(d,m,y);
  if(y>0)
  {
  System.out.println(" VALID DATE\n"+y);
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