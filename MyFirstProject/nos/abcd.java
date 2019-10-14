//a
//b c
//d e f
//g h i j

public class abcd
{
    public static void main(int n)
    {
        int i,j,p=97;
        for(i=1;i<=n;i++)
        {  
           for(j=1;j<=i;j++)
           {
               System.out.print((char)p+++" ");    
           }
           System.out.println();
        }
    }
    
}
