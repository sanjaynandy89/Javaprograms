import java.util.*;
class string2014s
{    
    public static void main(String args[])
    { 
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a sentence");
        String s=sc.nextLine();
        String s1=s.toUpperCase();int len=s.length();
        StringTokenizer str=new StringTokenizer(s1,".?!");
        int count=str.countTokens();
        String a[]=new String[count];
        int index=0;
        
        if(s.charAt(len-1)=='.'||s.charAt(len-1)=='?'||s.charAt(len-1)=='!')
        { while( str.hasMoreTokens())
            {
                a[index++]=str.nextToken();
                
                
            }System.out.println("enter a word and position of the word");
            String word=sc.nextLine();
            String word1=word.toUpperCase();
            int pos=sc.nextInt();String s2="";
            for(int i=0;i<count;i++)
            {
                if(a[i].equals(word1)==true&& i==pos-1)
                continue;
                else
                s2+=a[i];
                
            }
            System.out.println(s2);
            
            
            
            
            
        }
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
}