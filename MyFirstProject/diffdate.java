import java.io.*;
class diffdate
{
    
 public static void main()throws IOException{
 int a[]={31,28,31,30,31,30,31,31,30,31,30,31};
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 int d,m,y,d1,m1,y1,s=0,s1=0,i,x;
 
     
  System.out.println("Enter your date1 of birth in dd mm yyyy format:");
  d=Integer.parseInt(br.readLine());

  m=Integer.parseInt(br.readLine());
  y=Integer.parseInt(br.readLine());
  System.out.println("Enter your date2 of birth in dd mm yyyy format:");
  d1=Integer.parseInt(br.readLine());

  m1=Integer.parseInt(br.readLine());
  y1=Integer.parseInt(br.readLine());
  for(i=0;i<m-1;i++)
  {
      s=d+a[i];
  
  }
  if(y%4==0)
  {
   s=s+1;
  }
  
  for(i=0;i<m-1;i++)
  {
   s1=d1+a[i];
  }
  if(y%4==0)
  {
   s1=s1+1;
  }
  s1=s1+d1;
  x=s1-s;
  System.out.print("Total number of days between two is"+x);
}
}
  