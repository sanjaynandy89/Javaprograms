
import java.io.*;
class validdatenew
{
    int days[]={31,28,31,30,31,30,31,31,30,31,30,31};
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int m;
    int d;
    int y;
    public void takedate()throws IOException
    { 
        System.out.println("enter the month");
        m=Integer.parseInt(br.readLine());
         System.out.println("enter the date");
         d=Integer.parseInt(br.readLine());
         System.out.println("enter the year");
         y=Integer.parseInt(br.readLine());
         int li;
         li=leap(y);
         if(li==1)
         days[1]=29;
         int x=validdate(m,d,y);
            
            if(m<0||m>12)
            {
                System.out.println("invalid date");
                
                
            }
         else if(d<0||d>days[m-1])
         {
             System.out.println("invalid month");
             
            }
            else if(y>0)
            {
                System.out.println("valid Date");
                System.out.println("Day of the year"+x);
                
            }
            else
            {
                System.out.println("invalid year");
                
            }
        }    
            int validdate(int m1,int d1,int y1)
            {
                int li,i;
                li=leap(y);
                if(d1>days[m1-1])
                return 0;
                
            else
            
            {
                for( i=0;i<m1-1;i++)
                {
                    d1=d1+days[m1-1];
                }
                d1=d1+li;
                return d1;
            }
        
        }
        int leap(int y)
        
        {if(y%100==0&& y%400==0)
            return 1;
            else if(y%100!=0&&y%4==0)
            return 1;
            else 
            return 0;
        }
            
        public static void main()throws IOException
        {
            validdatenew ob= new validdatenew();
            ob.takedate();

            
        }

    
    
    
    
    
}