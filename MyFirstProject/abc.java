
import java .io.*;
class abc  
{
      int sumDigit(int n){
            
          int d;
          int sum=0;
          while(n!=0){
          d=n%10;
          sum=sum+d;
          n=n/10;
         }
          return sum;
          
          
        }
        int countDigit(int n){
            
          int d;
          int c=0;
          while(n!=0){
          d=n%10;
          c++;
          n=n/10;
        }
          return c;
          
          
        }
    
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter two no.");
        int m=Integer.parseInt(br.readLine());
        int n=Integer.parseInt(br.readLine());
        abc ob=new abc();
        int count=0;
        int x=0;
        if(m>=100 && m<=10000 && n>=10 && n<=100)
        {
              
            for(int i=m;i<=10000;i++)
            {
                
                   x=ob.sumDigit(i);
                  
                  if(x==n)
                  {
                      count=ob.countDigit(i);
                        System.out.println("The required number is"+i);
                         System.out.println("Number of digit is"+count);
                      break;
                  }       
            } 
            } 
        else
        {
            
         System.out.println("Invaid Input");   
        }   
 
    }    
}
    
    


