
import java.io.*;
class quiz
{   int n;
    String arr[]=new String[10];
    String a[][]=new String[10][5];
    int s[]= new int[10];
        
     void input()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter no. of participants");
        n=Integer.parseInt(br.readLine());
        //if(n<=3||n>=7)
        
        //{
            System.out.println("the participant answer");
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<5;j++)
               { 
                a[i][j]=br.readLine();
               }
        
            }
            System.out.println("name of participant");
            for(int i=0;i<5;i++)
            {
                arr[i]=br.readLine();
            
            
            
             }
        
           // }
        
    }
    void match()
    {
        
        int count;
        for(int i=0;i<n;i++)
        {
            count=0;
            for(int j=0;j<5;j++)
            {
                if(a[i][j].equals(arr[j]))
                {
                    count ++;
                }
                
            s[i]=count;
        }
        
        
    }
   
} 
void max()
{   int max=s[0];
    for(int i=0;i<n;i++)
    {if(max<s[i])
        {
            max=s[i];
            
        }
    
    }
     System.out.println("scores");
    for(int i=0;i<n;i++)
    {
        System.out.println("participant"+(i+1)+"="+s[i]);
        
    }
    for(int i=0;i<n;i++)
    {
        if(s[i]==max)
        {
            System.out.println("highest scoreparticipant"+(i+1));
        }
        
    }
}
public static void main()throws IOException
{
    quiz ob =new quiz();
    ob.input();
    ob.match();
    ob.max();
    
}
}

