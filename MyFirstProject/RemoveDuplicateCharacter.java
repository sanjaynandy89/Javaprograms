import java.util.*;
public class RemoveDuplicateCharacter
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String str=sc.nextLine();
        int len=str.length();
        String str1="";
        int flag;
        for(int i=0;i<len;i++)
        {   flag=0;
            for(int j=0;j<i;j++)
            {
                if(str.charAt(j)==str.charAt(i))
                {   flag=1;
                    break;
                }    
                
            } 
            if(flag==1)
            continue;
            else
            str1=str1+str.charAt(i);
        
    }  
    System.out.println("After removing duplicate "+str1);
}
}
