import java.util.*;
class Matrix2014{
public static void main(String args[])
throws InputMismatchException{
Scanner scan=new Scanner(System.in);

System.out.println("Enter the number of rows and columns dimention: ");
int m=scan.nextInt();
int a[][]=new int[m][m]; 
int flag=0; int sumleft=0;int sumright=0;
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
System.out.println("sysmetric matrix" );
for(int i=0;i<m;i++)
{
    for(int j=0;j<m;j++)
    {
        if(a[i][j]!=a[j][i]){
            flag=1;
            break;
        }
    }
}
    if(flag==1)
            System.out.println("nonsysmetric matrix");
            else
            System.out.println("sysmetric matrix");
         
    for(int i=0;i<m;i++){
        for(int j=0;j<m;j++)
        {
            if(i==j)
            {
                sumleft+=a[i][j];
            }
         if ((i+j)==m-1)
        {
            sumright+=a[i][j];
        }

    }
    }
    System.out.println("sum of  right diagonal"+sumright); 
      System.out.println("sum of left diagonal"+sumleft); 
     
      
            
            
}
}