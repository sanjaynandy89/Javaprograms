import java.io.*;
class Fasinatingnumber
{
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" enter a no.");
        int n=Integer.parseInt(br.readLine());
        int s3,s1,s2,sum=0;int flag=0,d,c=0;
        s1=n*1;
        s2=n*2;
        s3=n*3;
        String str1=Integer.toString(s1);
        String str2=Integer.toString(s2);
        String str3=Integer.toString(s3);
        String str4=str1+str2+str3;
        sum=Integer.parseInt(str4);
        System.out.println(sum);
        int a[]=new int[20];
        int x=0;
        while(sum>0)
        {
            d=sum%10;
            a[x++]=d;
            sum=sum/10;
            
        }  
        for(int i=1;i<=9;i++)
        {
            
            
           for(int j=0;j<x;j++)
           {
               
               if(a[j]==i)
               c++;
            }
            if(c>1)
            {
               flag=1;
               break;
                
            } 
            c=0;
        }
        if(flag==1)
        System.out.println(" nOt Fashinating Number");
        else
        System.out.println(" Fashinating Number");

    }
    
    
}