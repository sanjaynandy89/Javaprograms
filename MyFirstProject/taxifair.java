import java.util.*;
public class taxifair
{
    public static void main(String args[])
    { int distance,amount;

        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter distance");
        distance=sc.nextInt();
        if(distance<=5)
        {
            amount=100;
        }
        else if(distance>5 && distance <=15)
        {
            amount=100+10*(distance-5);

        }
        else if(distance>5 && distance <=25)
        {
            amount=100+8*(distance-5);
        } 
        else
        {
            amount=100+5*(distance-5);
        }  
        System.out.println("Taxi no 12345");
        System.out.println("Distance"+distance);
        System.out.println("Amount"+amount);
    }
}