import java.io.*;
public class perfect1
{
int x;
perfect1()
{
x=0;
}
perfect1(int n)
{
x=n;
}
void perfectsq()
{
int count=0;

for(int i=1;i<x;i++)
{
 int k=0;
 k=i*i;
 if(k>x)
 {
     System.out.println("The Perfect Square of "+i+"is"+k);
     count++;
 }   
 
 if(count==5)
 break;
k=0;
}
}

public static void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter a no:");
int no=Integer.parseInt(br.readLine());
perfect1 obj=new perfect1(no);
obj.perfectsq();

}  
  }