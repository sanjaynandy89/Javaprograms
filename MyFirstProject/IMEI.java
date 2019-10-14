/*If input is IMEI  = 490154203237518

imei number java

Since, 60 is divisible by 10, hence the given IMEI number is Valid.



*/
import java.io.*;
class IMEI
{
    int sumDig(int n) // Function for finding and returning sum of digits of a number
    {
        int sum1 = 0;
        while(n>0)
        {
            sum1 = sum1 + n%10;
            n = n/10;
        }
        return sum1;
    }
     
    public static void main(String args[])throws IOException
    {
        IMEI ob = new IMEI();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         
        System.out.print("Enter a 15 digit IMEI code : ");
        long n = Long.parseLong(br.readLine()); // 15 digits cannot be stored in 'int' data type
         
        String s = Long.toString(n); // Converting the number into String for finding length
        int l = s.length();
         
        if(l!=15) // If length is not 15 then IMEI is Invalid
            System.out.println("Output : Invalid Input");
        else
        {
            int d = 0, sum = 0;
            for(int i=15; i>=1; i--)
            {
                d = (int)(n%10);
                 
                if(i%2 == 0)
                {
                    d = 2*d; // Doubling every alternate digit
                }
 
                sum = sum + ob.sumDig(d); // Finding sum of the digits
                 
                n = n/10;
            }
             
            System.out.println("Output : Sum = "+sum);
             
            if(sum%10==0)
                System.out.println("Valid IMEI Code");
            else
                System.out.println("Invalid IMEI Code");
        }
    }
}

