import java.util.*;
class Combine
{
    int com[];
    int size;
    static Scanner sc = new Scanner(System.in);
     
    Combine(int nn)
    {
        size = nn;
        com = new int[size];
    }
     
    void inputarray()
    {      
        System.out.println("\n* Input the Array *\n");
        for(int i=0; i<size; i++)
        {
            System.out.print("Enter Element ["+(i+1)+"] : ");
            com[i] =sc.nextInt();
        }
        System.out.println();
    }
     void sort(){ 
        /* Sorting the result*/
        int temp=0;
        for(int i=0; i<size-1; i++)
        {
            for(int j=i+1; j<size; j++)
            {
                if(com[i]>com[j])
                {
                    temp = com[i];
                    com[i] = com[j];
                    com[j] = temp;
                }
            }
        }
    }
         
 
    void  mix(Combine A,Combine B)
    {
        int size = A.com.length + B.com.length; //size of resulting array
        
        int x = 0;
         
        /* Merging the array of current object with array of parameter object */
        for(int i=0; i<size; i++)
        {
            if(i<A.com.length)
               com[i] = A.com[i];
            else
            {
                com[i] = B.com[x];
                x++;
            }
        }
    }
       
       
    
         
    void display()
    {
        for(int i=0; i<size; i++)
        {
            System.out.print(com[i] + " ");
        }
        System.out.println();
    }
     
    public static void main(String args[])
    {
        System.out.print("Enter size of the 1st array : ");
        int p =sc.nextInt();
        Combine obj1 = new Combine(p);
        System.out.print("Enter size of the 2nd array : ");
        int q =sc.nextInt();
        Combine obj2 = new Combine(q);
        Combine obj3 = new Combine(p+q); //obj3 is the  object which is referred to the merged array
        obj1.inputarray();
        obj2.inputarray();
        obj3.mix(obj1,obj2);
        obj3.sort();
        System.out.print("The 1st Array is : ");
        obj1.display();
         
        System.out.print("The 2nd Array is : ");
        obj2.display();
         
        System.out.print("The Merged Array is : ");
        obj3.display();
    }}