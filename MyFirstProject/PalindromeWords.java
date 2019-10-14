/*A palindrome is a word that may be read the same in either direction.
Accept a sentence in upper case which is terminated by either ‘.’,’,’, ‘?’, ‘!’. Each word in the sentence is separated by a blank space.
Perform the following tasks:

1.    Display the count of palindromic words in the sentence
2.    Display the palindromic words in the sentence.

Example 1:
Input: MOM AND DAD ARE COMING AT NOON.

Output: MOM DAD NOON
Number of palindromic words: 3

Example 2:
Input: HOW ARE YOU?
Output: No palindromic words*/

import java.io.*;
import java.util.*;

public class PalindromeWords
{
    


 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   String str;
   StringTokenizer st;
   String s;
   int i=0;
    public void show()throws Exception
   {
    System.out.println("Enter the sentence:");
    str=br.readLine().toUpperCase();
    st=new StringTokenizer(str," .,?!");
    while(st.hasMoreTokens())
    {
        s=st.nextToken();
        if(palin(s))
        System.out.print(" "+s);
    }
    if(i==0)
    System.out.println("\nNo palindromic words");
    else
    System.out.println("\nNumber of palindromic words :"+i);
    }
   
     boolean palin(String str1)
    {
         int x,j,len;
         len=str1.length();
         
         char chr;
         String str2="";
         for(j=len-1;j>=0;j--)
         {
             chr=str1.charAt(j);
             str2=str2+chr;
            }
            if(str1.equals(str2)){
                i++;
            return true;
            
        }
            else
{

            return false;
        }
        }
       
     public static void main(String args[]) throws Exception
     {
      PalindromeWords ob=new PalindromeWords();
      ob.show();
      }
      }


