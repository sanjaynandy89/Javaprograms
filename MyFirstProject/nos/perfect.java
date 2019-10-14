
public class perfect
{
    public static void main(int n)
    {
            int i,f,s=0,m=n;
            for(i=1;i<=n/2;i++)
            {
                if(n%i==0)
                {
                    s=s+i;
                }
            }
            if(s==m)
                System.out.println(m+" is a perfect no.");
                else 
                System.out.println(m+" is not a perfect no.");
            }
        }