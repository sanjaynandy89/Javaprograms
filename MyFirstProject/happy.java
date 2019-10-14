import java.io.*;
class happy 
{
    int n;
    happy()
    {n=0;
    }
    void getNum(int nn)
    {n=nn;
    }
        int sum_sq_digits(int x)
       
        {
            int sum=0;
            if(x==0)
            return 0;
            else
            {
                int r=x%10;
                sum=r*r;
                return (sum+sum_sq_digits(x/10));
            }
                
        }
        void isHappy()
        {
            int x=sum_sq_digits(n);
            while(x>9)
            {
                x=sum_sq_digits(x);
            }    
            if(x==1)
            System.out.println("Happy Number ");
            else 
            System.out.println("Not a Happy Number");
        }
        public static void  main(String args[])throws IOException
        {
            
            
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a number ");
            int num=Integer.parseInt(br.readLine());
            happy ob=new happy();
            ob.getNum(num);
            ob.isHappy();
            
            
        }    
    }
        