import java.util.*;
public class SecondMostFrequentCharacter
{
   public static void main(String args[])
   {   String str;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a String");
       str=sc.nextLine();
       int len=str.length();
       char s[]=new char[len];
       int count;
       int count1=0,count2=0;
       int c[]=new int[len];
       for(char i='A';i<='Z';i++)
        {
            count=0;
            for(int j=0;j<len;j++)
            {
                char ch=str.charAt(j);
                if(ch==i)
                {
                    count ++;
                }
                
               
            }
            if(count>0)
                {
                s[count1]=i;
                c[count2]=count;
                System.out.println("Character"+i+"Frequency"+count);
                count1++;
               count2++;
               }
            
        }
        int first=0;int second=0;
        for(int i=1;i<count2;i++)
        {
            if(c[i]>c[first])
            { second=first;
              first=i;
              
            }  
            /* If count[i] is in between first and second then update second  */
           else if (c[i] >c[second] &&
                 c[i] != c[first])
            second = i;
             
        }    
        System.out.println(count1+" "+count2);
        System.out.println("Character with Second Highest frequency"+s[second]+" "+c[second]);
       
   }    
}
