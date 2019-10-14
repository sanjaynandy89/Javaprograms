//s=10+1+9+2+.......n terms
public class series7
{
    public static void main(int n)
  {
      int p=10,sum=0,q=1,i;
      for(i=1;i<=n;i++)
      { 
          if(i%2==0)
          {
          sum=sum+q;
          q++;
        }
            else
        {
            sum=sum+p;
        p--;
    }
        
        
    }
    System.out.println(sum);
}
}
