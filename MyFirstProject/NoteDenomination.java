
import java.io.*;
public class NoteDenomination
{
   public static void main(String args[])throws IOException
   {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int notes[]={1000,500,100,50,20,10,5,2,1};
      int i,x,n,amnt=0;
        String ty[]={"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
        String ten[]={"Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
        String unit[]={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        System.out.print("Enter a Number : ");
        n=Integer.parseInt(br.readLine());
        amnt=n;
       int  amnt1=n;
       int c=0;
        
        /*checking whether the number is in the range [1-9999] or not*/
        if(n<1 || n>99999)
            System.out.println("Out of Range");
        else
        {
        int th=n/1000; //finding the digit at thousand's place
        int h=(n/100)%10; //finding the digit at hundred's place
        int t=(n/10)%10; //finding the digit at ten's place
        int u=n%10; //finding the digit at unit's place
        System.out.print("Output = ");
 
        /*Condition for printing digit at thousand's place, is that it should not be zero*/
        if(th<10)
        System.out.print(unit[th]+" Thousand");
        else
        if(th<20)
         System.out.print(ten[th-10]+" Thousand");
         else
         { 
            int n1;
            n1=th;
            int d;
            if(th%10==0)
             System.out.print(ty[th/10]+" Thousand");
             else{
             System.out.print(ty[th/10]);
              System.out.print(unit[th%10]);
               System.out.print(" Thousand");
            }
         
        }
 
        /*Condition for printing digit at hundred's place, is that it should not be zero*/
        if(h!=0)
        System.out.print(" "+unit[h]+" Hundred");
 
        /*Condition for printing the word "And"*/
        if((t!=0 || u!=0)&&(th!=0 || h!=0))
        System.out.print(" And");
 
        /*Condition for printing digit at ten's place*/
        if(t==1) //When digit at ten's place is 1, we have different words like Ten, Eleven etc.
        System.out.print(" "+ten[u+1]);
        else //if it is not 1 then we print the words following a normal pattern
        System.out.print(" "+ty[t]+" "+unit[u]);
        }
        System.out.println();
      for(i=0;i<9;i++)
      {
          
          x=amnt/notes[i];
          if(x!=0)
          System.out.println("The no of notes of Rs "+notes[i]+"x"+x+"="+notes[i]*x);
          c=c+x;
          amnt=amnt%notes[i];
          
      }   
      System.out.println("---------------------------------------");
      System.out.println("Total=                    "+amnt1);
      System.out.println("The  total nuber of notes"+c);
   }
}
