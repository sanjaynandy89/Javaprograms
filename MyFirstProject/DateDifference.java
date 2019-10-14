
/**
 * Write a description of class DateDifference here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
public class DateDifference
{
   
 int days[]={31,28,31,30,31,30,31,31,30,31,30,31};
 
 public int takeDate(int d,int m,int y) 
 {
  int li;
         li=leap(y);
         if(li==1)
         days[1]=29;
         
 if(m<=0 || m>12)
 {
   System.out.println("INVALID MONTH");
   return 0;
  }
 else if(d<=0 || d>days[m-1])
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
  
   public static void main(String args[]) throws Exception
   {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 int d1,m1,y1,d2,m2,y2;
       System.out.println("Enter your date of birth in dd mm yyyy format:");
  d1=Integer.parseInt(br.readLine());

  m1=Integer.parseInt(br.readLine());
  y1=Integer.parseInt(br.readLine());
    DateDifference ob=new DateDifference();
    int x1=ob.takeDate(d1,m1,y1);
    if(x1==0)
    System.out.println("inValid date");
    else
    System.out.println("valid date");
    
    System.out.println("Enter your date of birth in dd mm yyyy format:");
  d2=Integer.parseInt(br.readLine());

  m2=Integer.parseInt(br.readLine());
  y2=Integer.parseInt(br.readLine());
  int x2=ob.takeDate(d2,m2,y2);
    if(x2==0)
    System.out.println("inValid date");
    else
    System.out.println("valid date");
    int diff=x2-x1;
    System.out.println("difference"+diff);
    
    
    
    }
    }

