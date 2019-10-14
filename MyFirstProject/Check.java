import java.io.*;
import java.util.*;
public class Check
{
    
    String str;
    int w;
    int count=0;
    BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
    void inputString()throws IOException{
        System.out.println("Enter the String");
        str=br.readLine();
    }
    

void counter(int i){
    String str1="";
    if(i<str.length())
    {
        char ch=str.charAt(i);

        if(ch==' ')
        {
            
            
            char c= str1.charAt(0);
            if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            {
                count++;
               
            }
              str1="";
        }
        else
        {  
            
         str1=str1+ch;
         
         
            
        }   
        
         counter(i+1);
        
    }
    

}
void display(){
    
    System.out.println(" word is "+str);
    counter(0);
    System.out.println("number of words"+count);
    
    
    
}
public static void main()throws IOException{
    
    Check obj=new Check();
    obj.inputString();
    obj.display();
}
    
     
}
