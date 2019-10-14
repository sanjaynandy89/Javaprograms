
/**
 * Write a description of class SpiralMatrix here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
public class SpiralMatrix
{
  int x;
int t,r,c,i,j,n;
int a[][];
SpiralMatrix(){//constructor for SpiralMatrix
    t=1;
   a=new int[25][25];
   c=-1;

}
void accept()throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the size of array:");
n=Integer.parseInt(br.readLine());
x=n;
}   
void Sprial(SpiralMatrix A)//passing object as parameter
{

r=n-1;
while(n >0)
{
for(i=1;i<=n;i++)//Move rowwise to right  
{
a[r][++c]=t++;
}
for(i=1;i<=n-1;i++)//Move columnwise to  up 
{
a[--r][c]=t++;
}
for(i=1;i<=n-1;i++)//Move rowwise  to left 
{
a[r][--c]=t++;
}
for(i=1;i<=n-2;i++)//Move columnwise  to down 
{
a[++r][c]=t++;
}

n=n-2;

}
 }
void display(){
System.out.println("\nMatrics\n");
for(i=0;i<x;i++)
{
 for(j=0;j<x;j++)
 {
 
 System.out.print(a[i][j]+" ");
 }
 System.out.println();

}
}
public static void main(String args[])throws Exception
{
 SpiralMatrix ob1=new SpiralMatrix();//Create first object
 SpiralMatrix ob2=new SpiralMatrix();////Create second object
 ob1.accept();//call funtion by first object
 ob1.Sprial(ob2);//passing object as argument
 ob1.display();//call funtion by first object
 
}
}

