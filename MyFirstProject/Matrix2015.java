import java.util.*;
class Matrix2015{
public static void main(String args[])
throws InputMismatchException{
Scanner scan=new Scanner(System.in);

System.out.println("Enter the number of rows and columns dimention: ");
int m=scan.nextInt();
int a[][]=new int[m][m];
System.out.println("Enter "+m*m+" elements for the matrix : ");
for(int i=0;i< m;i++)
{
    for(int j=0;j< m;j++)
    a[i][j]=scan.nextInt();
}
System.out.println("\nOriginal Matrix : ");
for(int i=0;i< m;i++)
{
    for(int j=0;j< m;j++)
    System.out.print(a[i][j]+" ");
    
    System.out.println();
}

System.out.println(" the rotational matrix ");
for(int i=0;i<m;i++)
{
    for(int j=m-1;j>=0;j--)
    {
    System.out.print(a[j][i]+" ");
    }
     System.out.println();
}
System.out.println("sum of corner element="+ ""+ (a[0][0]+a[0][m-1]+a[m-1][0] +a[m-1][m-1]));









}
}
