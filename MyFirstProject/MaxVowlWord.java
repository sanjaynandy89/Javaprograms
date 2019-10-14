
/**
 * Write a description of class MaxVowlWord here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class MaxVowlWord
{
    public static void main(String args[])
    {
        String str="Happy New Year";
        String str1=str.substring(0,5);
        String str2=str.substring(5,9);
        String str3=str.substring(9,14);
        int count1=0,count2=0,count3=0;
        char ch;
        for(int i=0;i<str1.length();i++)
        {
            ch=str1.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'|ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                count1++;
                
                
            }    
            
            
        } 
        for(int i=0;i<str2.length();i++)
        {
            ch=str2.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                count2++;
                
                
            }    
            
            
        }   
        for(int i=0;i<str3.length();i++)
        {
            ch=str3.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                count3++;
                
                
            }    
            
            
        } 
        
        if(count1>count2)
        {
            if(count1>count3){
              System.out.println("Largest Vowe Word"+str1);  
                
            }
        } 
        else{
              if(count2>count3){
                  
                  System.out.println("Largest Vowe Word"+str2);
                }
                else
                {
                    
                     System.out.println("Largest Vowe Word"+str3);
                    
                    
                }    
        
        }    
        
        
        
        
        
    }
}

       