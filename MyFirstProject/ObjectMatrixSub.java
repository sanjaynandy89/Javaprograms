import java.util.*;
class ObjectMatrixSub
{
    int arr[][];
    int r,c;
    static Scanner  sc= new Scanner(System.in);
     
    ObjectMatrixSub(int nn,int mm)
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
            arr[i][j] =sc.nextInt();
        }
        System.out.println();
    }
    }
 
    ObjectMatrixSub subtration(ObjectMatrixSub A)
    {
       
        ObjectMatrixSub B = new ObjectMatrixSub(r,c); //object which will store the result of merging
        int sum=0;
       for(int i=0;i<r;i++)
       {
           for(int j=0;j<c;j++)
           {
               B.arr[i][j]=A.arr[i][j]-arr[i][j];
               
            
            
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
        int p =sc.nextInt();
        System.out.print("Enter column  of the  array : ");
        int q =sc.nextInt();
        ObjectMatrixSub obj1 = new ObjectMatrixSub(p,q);
        obj1.accept();
         
        ObjectMatrixSub obj2 = new ObjectMatrixSub(p,q);
        obj2.accept();
  
        ObjectMatrixSub obj3 = obj2.subtration(obj1); //obj2 is the current object which is referred by 'this' keyword above
         
        System.out.print("The 1st Array is : ");
        obj1.display();
         
        System.out.print("The 2nd Array is : ");
        obj2.display();
         
        System.out.print("The Merged Array is : ");
        obj3.display();
    }}