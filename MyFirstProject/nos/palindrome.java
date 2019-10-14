

public class palindrome
{
public static void main(int n)
{
  int i,d,m=n,r=0;
  {
      while(n!=0)
      {
      d=n%10;
      r=r*10+d;
      n=n/10;
    }
    if(r==m)
    {
        System.out.println(m +" is a palindrome no " );
    }
    else
    System.out.println(+ m +" is not a palindrome no.");
}
}
}

