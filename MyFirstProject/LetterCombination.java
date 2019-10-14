import java.io.*;
public class LetterCombination
{
    public static void main(String args[])throws IOException
    {
        String str;
        int i ,j,k,l,m;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a Four letter word");
        str=br.readLine();//Inputs the four Letter word
        l=str.length();
        System.out.println("The required combination");
        //To Generate different four letter Combination's
        for(i=0;i<l;i++)
        {
            for(j=0;j<l;j++)
            {
              for(k=0;k<l;k++)
              
              {  
                  for(m=0;m<l;m++)
                  {
                
                   if(i!=j&&j!=k&&k!=m&&k!=i&&k!=j&&m!=i&&m!=j) //Checks the combintions
                   {  
                   System.out.print(str.charAt(i)+""+str.charAt(j)+""+str.charAt(k)+""+str.charAt(m));//print different four letter Combination
                    System.out.println();
                   }
                  }
              
              }
           
                
              
            }   
            
            
        }    
        
    }   
   
}
