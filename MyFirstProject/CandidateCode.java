/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class CandidateCode {
   void reverse1(String str)
   {    
       int len=str.length();
       char ch[]=new char[len];
       int pos1[]=new int[len];
       int pos2[]=new int[len];
       int pos3[]=new int[len];
       int pos4[]=new int[len];
       int count=0;
       int count1=0;
       int count2=0;
       int count3=0;
       int count4=0;
       for(int i=len-1;i>=0;i--)
       {  
           ch[count++]=str.charAt(i);
       }
       for(int i=0;i<len;i++)
       {
           if(ch[i]=='A')
           pos1[count1++]=i;
           if(ch[i]=='T')
           pos2[count2++]=i;
           if(ch[i]=='C')
           pos3[count3++]=i;
           if(ch[i]=='G')
           pos4[count4++]=i;
           
           
       }
       count1=0;
       count2=0;
       count3=0;
       count4=0;
       for(int i=0;i<len;i++)
       {
           if(pos1[count1++]==i)
           ch[i]='T';
           if(pos2[count2++]==i)
           ch[i]='A';
           if(pos3[count3++]==i)
           ch[i]='G';
           if(pos4[count4++]==i)
           ch[i]='C';
       }
       
       for(int i=0;i<len;i++)
       {
           System.out.print(ch[i]);
       }
   }
   public static void main(String args[] ) throws Exception {

	//Write code here
	
     CandidateCode ob=new CandidateCode();
     ob.reverse1("ATGC");
   }
}
