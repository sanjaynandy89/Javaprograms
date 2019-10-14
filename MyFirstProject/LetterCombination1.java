import java.io.*;
public class LetterCombination1
{
    public static void main(String args[])throws IOException
    {
        String str;
        int i ,j,k,l,m;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a Four letter word");
        str=br.readLine();
        l=str.length();
        System.out.println("The required combination");
        for(i=0;i<l;i++)
        {
            for(j=0;j<l;j++)
            {
              for(k=0;k<l;k++)
              {  
                
                if(i!=j&&j!=k&&k!=i)  
                {
                System.out.print(str.charAt(i)+""+str.charAt(j)+""+str.charAt(k));
                 System.out.println();
                }
              
            }
           
                
              
            }   
            
            
        }    
        
    }   
   
}
