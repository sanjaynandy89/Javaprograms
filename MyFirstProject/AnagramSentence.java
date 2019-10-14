import java.util.*;
public class AnagramSentence
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a  first String ");
       String str1=sc.nextLine();
       System.out.println("Enter a  Second String ");
       String str2=sc.nextLine();
       int len1=str1.length();
	   int len2=str2.length();
	   int found,not_found=0;
	if(len1==len2)
	{
		int len=len1;
		for(int i=0;i<len;i++)
		{
			found=0;
			for(int j=0;j<len;j++)
			{
				if(str1.charAt(i)==str2.charAt(j))
				{
					found=1;
					break;
				}
			}
			if(found==0)
			{
				not_found=1;
				break;
			}
		}
		if(not_found==1)
		{
			System.out.println("Strings are not Anagram to each other");
		}
		else
		{
			System.out.println("Strings are Anagram");
		}
	}
	else
	{
		System.out.println("Two string must have same number of character to be Anagram");
	}
       
   }    
}
