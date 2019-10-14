import java.io.*;
class alternate
{
    public static void main()throws IOException
    {   int p=0,flag=0,x=0;
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        System.out.println("enter a number");
        int n=Integer.parseInt(br.readLine());

        if(n>6)
        {
            System.out.println("Error!");

        }
        else
        {
            System.out.println("enter an sentence");
            String s=br.readLine();
            int len=s.length();
            if(n!=len)
            {
                System.out.println("Invalid");
            }
            else
            {
                char ar[]=new char[len];
                char ch=' ';
                for(int i=0;i<len;i++)
                {   ch=s.charAt(i);
                    ar[p++]=ch;
                }
                
                    for(int j=0;j<p;j++)
                    {
                        for(int k=j+1;k<p;k++)
                        {
                            if(ar[j]=='A'||ar[j]=='C'||ar[j]=='E'||ar[j]=='G'||ar[j]=='I'||ar[j]=='K')
                            {
                                
                            if(ar[j]==ar[k])
                            {

                                flag=1;
                                break;
                            } 
                           } 
                           else
                           {
                            x=1;
                            } 
                        }

                    }  
                    if(flag==1||x==1)
                    {
                        System.out.println("Invalid");
                    }  
                    else
                    {
                        System.out.println("valid");
                    }    

                } 
               

            }
        
        }
    }

    
