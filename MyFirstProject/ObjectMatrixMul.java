import java.util.*;
class ObjectMatrixMul
{
    int arr[][];
    int r,c;
    static Scanner  sc = new Scanner(System.in);
     
    ObjectMatrixMul(int nn,int mm)
    {
        r = nn;
        c=mm;
        arr = new int[r][c];
    }
     
    void accept()
    {      
        System.out.println("\n* Input the Array *\n");
        for(int i=0; i<r; i++)
        {
            for(int j=0;j<c;j++)
        {
            System.out.print("Enter Element ["+(i+1)+"] : ");
            arr[i][j] = sc.nextInt();
        }
        System.out.println();
    }
    }
 
    ObjectMatrixMul product( ObjectMatrixMul A)
    {
       
        ObjectMatrixMul B = new ObjectMatrixMul(r,c); //object which will store the result of merging
        int sum=0;
       for(int i=0;i<r;i++)
       {
           for(int j=0;j<c;j++)
           {
               for(int k=0;k<r;k++)
               {
                   
                 sum=sum+A.arr[i][k]*arr[k][j];
                 
                }  
                B.arr[i][j]=sum;
                sum=0;
            
            
            }
       }
       return (B);
    }
         
    void display()
    {
        for(int i=0; i<r; i++)
        {
            for(int j=0;j<c;j++)
        {
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
        }
    }
     
    public static void main(String args[])
    {
        System.out.print("Enter  row of the array : ");
        int p = sc.nextInt();
        System.out.print("Enter column  of the  array : ");
        int q =sc.nextInt();
        ObjectMatrixMul obj1 = new ObjectMatrixMul(p,q);
        obj1.accept();
         
        ObjectMatrixMul obj2 = new ObjectMatrixMul(p,q);
        obj2.accept();
  
        ObjectMatrixMul obj3 = obj2.product(obj1); //obj2 is the current object which is referred by 'this' keyword above
         
        System.out.print("The 1st Array is : ");
        obj1.display();
         
        System.out.print("The 2nd Array is : ");
        obj2.display();
         
        System.out.print("The Merged Array is : ");
        obj3.display();
    }}