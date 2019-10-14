/*Write a program to declare a square matrix A[][] of order MXM where M is an positive integer and represents row and column. M should be greater than 2 and less than 10.Accept the value of M from user. Display an appropriate message for invalid input.
Perform the following task:
a) Display the original matrix
b) Check if the given matrix is symmetric or not. If the element of the ith row and jth column is same as element of the jth row and ith column,.
c)Find the sum of the left and right diagonal of the matrix and display them

Example 1:
INPUT:
M=3
1 2 3
2 4 5
3 5 6
OUTPUT:
Original matrix
1 2 3
2 4 5
3 5 6

The given matrix is symmetric
Sum of the left diagonal=11
Sum of the right diagonal=10
Example 2:
INPUT: M=4
OUTPUT:
Original matrix:
7 8 9 2
4 5 6 3
8 5 3 1
7 6 4 2

The given matrix is not symmetric
Sum of the left diagonal=17
Sum of the right disgonal=20*/
import java.io.*;
 class SymetricMatrix
 {
 int left=0,right=0,m,i,j, arr[][];
 boolean bool=false;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  public void takeValues() throws Exception
  {
   System.out.println("Enter the value of 'm';");
   m=Integer.parseInt(br.readLine());
   if(m >=10)
   {
   System.out.println("Matrix size is out of range");
   return;
   }
   arr=new int[m][m];
   for(i=0;i < m; i++)
   {
    for(j=0;j <m;j++)
    {
    System.out.println("value:");
   arr[i][j]=Integer.parseInt(br.readLine());
   }
   }
   System.out.println("Original Matrix\n");
   for(i=0;i <m ; i++)
   {
    for(j=0;j <m; j++)
    {
    System.out.print(" "+arr[i][j]);
    }
    System.out.println();
    }
   for(i=0;i <m ; i++)
   {
    for(j=0;j <m; j++)
    {
    if(arr[i][j]!=arr[j][i])
    {
    bool=true;
    break;
    }
    }
    if(bool==true)
    break;
    }
    if(bool)
    System.out.println("The given matrix is not symmetric");
    else
    System.out.println("The given matrix is symmetric");
for(i=0;i <m ; i++)
   {
    for(j=0;j<m; j++)
    {

    if(i==j)
    left=left+arr[i][j];
    if(i+j==m-1)
    right=right+arr[i][j];
    }
    }
    System.out.println("Sum of the left diagonal="+left);
    System.out.println("Sum of the right diagonal="+right);
    }
  
  public static void main(String args[])throws Exception
      {
       SymetricMatrix ob=new SymetricMatrix();
       ob.takeValues();
       }
       }

