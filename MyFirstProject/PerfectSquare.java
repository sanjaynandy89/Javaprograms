
/**
 * Write a description of class PerfectSquare here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
public class PerfectSquare
{
    public static boolean  IsSquare(long target)
{
    // loop through all the numbers till the target
    for (long i = 0; i < target; i++)
    {
        // if we have a match
        if ((i * i) == target)
        {
            return true;
        }
    }

    // no matching number could be squared
    return false;
}
    

        public static void main(String args[])throws IOException
        {   boolean value; 
            int j=0;
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter a number : ");
            int n=Integer.parseInt(br.readLine());
             PerfectSquare ob=new  PerfectSquare();
              while(j!=3){
                  int k=++n;
            value= ob.IsSquare(k);
           
            if(value==true)
            {
                System.out.println("Perfect square"+k );
                j++;
            }
            
        }
    }
        }    
   

