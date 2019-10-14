
import java.io.*;
public class menudriven
{
  public static void main(String args[])throws IOException
  {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int n;
      int i;
      int d;
      int sum=0;
      
      System.out.println("Enter the choice 1 for Perfect Number 2 for PrimeNumber 3 ArmstrongNumber 4 for AutomorphicNumber 5 for KrisnamurtyNumber");
      int choice=Integer.parseInt(br.readLine()); //For Enter the Choice
          switch(choice)
           {
             case 1: //For Perfect Number
             System.out.println("Enter the number");
             n =Integer.parseInt(br.readLine());
             int f,s=0;
             int m=n;//store the number in a variable
            for(i=1;i<=n/2;i++)//For each element from 1 to Number/2
            {
                if(n%i==0)//check whether the element is a factor of the number
                {
                    s=s+i;//sum of the factors
                }
            }
            if(s==m)//sum of factors equals to number
            {
                System.out.println(m+" is a perfect no.");
            }
                else {
               System.out.println(m+" is not a perfect no.");
            }
            break;
            case 2://For  the Prime Number
            System.out.println("Enter the number");
            n =Integer.parseInt(br.readLine());
            int c=0;
            for(i=1;i<=n;i++) // For Each element from 1 to Number
              {
               if(n%i==0){// check the element is Factor of the number
                     c=c+1;//Increase The Counter by One
               } 
            }
            if(c==2)//When counter equals to two
               System.out.println("The number is prime");
                else 
                 System.out.println("The number is not prime");
                 break;
    
            case 3://For ArmStrong Number
            System.out.println("Enter the number");
            n =Integer.parseInt(br.readLine());
            int n1;
            n1=n;//Strore the Number in another variable
             while(n>0){ // Execute the Loop until Number  equals to zero
             d=n%10;//Extract digits From the number
             sum=sum+d*d*d;//sum of the cube of digits
             n=n/10;//divide the number by ten to get the next place
          }
                  if(sum==n1)//check sum equals to number
                     System.out.println("The number is ArmStrong");
                   else 
                 System.out.println("The number is not ArmStrong");
               break;
              case 4:
                   int m1,c1,r,p,k;c=0;
                   System.out.println("Enter the number");
                   n =Integer.parseInt(br.readLine());
                   m1=n;//store the number in another variable
                   p=m1*m1;// store the square of the number
                  while(n>0){// Execute the Loop until Number  equals to zero..
                    k=n/10;//divide the number by ten
                    c=c+1;// Increase the counter by one
                    n=k;//Store the  current value of the number in number
            
                }
                 s=(int)Math.pow(10,c);//Store the 10 th power of the counter
                 r=p%(int) s;//get the remainder from  10th power of the counter
               if(m1==r)//check the remainder eqauls to number or not
                    System.out.println("The number is an automorphic number");
               else
                System.out.println("The number is not an automorphic number ");
                   break;
                case 5:
                  System.out.println("Enter the number");
                  n =Integer.parseInt(br.readLine());
                 int m2=n;// store the number  in another variable
                 f=1;
                 while(n!=0)//Execute the Loop until number equals to zero
                 {
                d=n%10;//Extract the digits
                for(i=1;i<=d;i++)//Calculate factorial of each digit
                    {
                        f=f*i;
                 }
                sum=sum+f;//Sum of the factorial of digits
                f=1;
                n=n/10;//divide the number by ten to get the next place
              }
            if(sum==m2)//check whether the sum equals to the number
                {
                 System.out.println("The number is krisnamurty number");
                   }
                else{
                      System.out.println("The number is not a krisnamurty number");
                    }
                             break;
        
             default : 
                 System.out.println("Invalid Input ");
      } 
    }
}

