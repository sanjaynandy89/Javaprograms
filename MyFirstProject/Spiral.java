
/**
 * Write a description of class spiralmatrix here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
public class Spiral
{
  int x;
int t,r,c,i,j,n;
int a[][];
void accept()throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the size of array:");
n=Integer.parseInt(br.readLine());
x=n;
}   
void show()
{
t=1;
r=0;
c=-1;

a=new int[n][n];
while(n >0)
{
for(i=1;i<=n;i++)
{
a[r][++c]=t++;
}
for(i=1;i<=n-1;i++)
{
a[++r][c]=t++;
}
for(i=1;i<=n-1;i++)
{
a[r][--c]=t++;
}
for(i=1;i<=n-2;i++)
{
a[--r][c]=t++;
}
n=n-2;
}
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
 Spiral ob=new Spiral();
 ob.accept();
ob.show();
}
}
