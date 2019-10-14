
import java.util.*;
class number2014
{    public static void main()
    { Scanner sc =new Scanner(System.in);
        number2014 ob=new number2014();
        System.out.println("enter  2 no.s");
        int c=0;
        int m=sc.nextInt();
        //int n=sc.nextInt();
        /*for (int i=m;i<=n;i++)
        {
            if(ob.isComposite(i)==true && ob.isMagic(i)==true)      cv v{    System.out.println(i);
                 if(c==0)
                 System.out.println(i);
                 else
                 System.out.println(","+i);
                 c++;  
            }    
        }
        System.out.println("Frequency"+c); */
        
        if(ob.isComposite(m)==true && ob.isMagic(m)==true)
        System.out.println("Magic composite");
        
        
        
        
        
    }
    
boolean isComposite(int x)
{int c=0;
for(int i=1;i<=x;i++)
{if(x%i==0)
    {c++;
        
    } 
    
}
if(c>2)
    return true;
    else
    return false;
}
boolean isMagic(int x)
{
    int num=x,sum=0,r;int s=0;
    while(num>9)
    {
        r=num%10;
        sum+=r;
        while(sum!=0)
        {
            int r1=sum %10;
            s=s+r1;
            sum/=10;
        }
    
            
        }if(s==1)
         return true;
         else
         return false;
         
         

        
        
    }
    
    
    
    
}



    
    


    
    
