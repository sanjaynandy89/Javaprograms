
/**
 * Write a description of class EvilNumber1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class EvilNumber1
{
boolean evil(int num)
{   String str="";
    int c=0;
    while(num>0)
    {
        int d=num%2;
        str=str+d;
        num=num/2;
    }   
    System.out.println("Binary Equivalent is"+str);
    for(int i=0;i<str.length();i++)
    {
      if(str.charAt(i)=='1')
      {
          c=c+1;
      }
    }
    if(c%2==0)
    {
       return true;   
    }
    else
    {
       return false; 
    }    
}    

   
    public static void main(String args[])
    {  
        EvilNumber1 ob=new EvilNumber1();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a range");
        int m=sc.nextInt();
        int n=sc.nextInt();
        for(int i=m;i<=n;i++)
        {
        boolean b=ob.evil(i);
        if(b==true)
        System.out.println(i+"Evil number");
        else
        System.out.println(i+"Not a Evil Number");
        }
    }    
}
