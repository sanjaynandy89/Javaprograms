//s=(1*2)+(2*3)+(3*4)........ n terms

public class series13
{
  public static void main(int n)
  {
      int term=0,i;
      for(i=1;i<=n;i++)
      {term=term+i*(i+1);
          
        }
        System.out.println(term);
    }
}
