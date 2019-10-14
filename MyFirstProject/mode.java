
import java.io.*;
public class mode
{
public static void main()throws IOException{
BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter the number of elements ");
int n=Integer.parseInt(br.readLine());

int num[]=new int[n];
int max=0, maxCount=0;
int min = 0;

System.out.println("Enter the Marks");
for(int i=0;i<n;i++){
num[i]=Integer.parseInt(br.readLine());
}
System.out.println("Marks:");
int length=num.length;
for (int i = 0; i <length; ++i) {
int count = 0;
for (int j = 0; j <length; ++j) {
if (num[j] == num[i]) ++count;
}
if (count > maxCount)
{
maxCount = count;
max = num[i];
}
}
System.out.println("Mode is "+max);
System.out.println("Frequency of MODE"+maxCount);

}

}



  




    