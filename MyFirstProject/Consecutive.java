
/**
 * Write a description of class Consecutive here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
public class Consecutive
{
    

        public static void main(String args[])throws IOException
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter a number : "); //inputting the number
            int n=Integer.parseInt(br.readLine());
             
            int sum=0,c=0,j=0;
            for(int i=1;i<n;i++)
            {
                sum=i;
                j=i+1;
 
/* adding consecutive natural numbers till sum is less than the given number */
 
                while(sum<n)
                {
                    sum=sum+j;
                    j++;
                }
 
 
                    if(sum==n)
                    {
                        for(int k=i;k<j;k++)
                        {
                            if(k==i)
                                System.out.print(k);
                            else
                                System.out.print(" + "+k);
                        }
                     System.out.println();
                    }
            }
        }
    }



