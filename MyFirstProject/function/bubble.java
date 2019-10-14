import java.io.*;
public class bubble
{

     public void bubblesort(int b[]){
         int i,j,temp,size;
          for(i=0;i<b.length;i++)
            {   
              
                //loop for find the  next greatest element
                for(j=0;j<b.length-1-i;j++)
                {
                    if(b[j]>b[j+1])
                    {
            //swapping to bring the greatest  element  in the right
            temp=b[j];
            b[j]=b[j+1];
            b[j+1]=temp;
        }
    }
    }
        //print the array after sorting
        System.out.println("\nelements of the array after sorting");
            for(i=0;i<b.length;i++)
                System.out.print(b[i]+"\t");
        
    
    
      
    }
     public static void main()throws IOException
    { int i,j,temp;
            
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter the size of the array");
            int size=Integer.parseInt(br.readLine());
             int a[]=new int[size];
            //enter the elements of the array
            System.out.println("enter the elements of the array");
            for(i=0;i<size;i++)
                a[i]=Integer.parseInt(br.readLine());
                //print the array before sorting
                   System.out.println("elements of the array before sorting------->");
                        for(i=0;i<size;i++)
                System.out.print(a[i]+"\t");
            // bubble sort algoritm    
            bubble ob=new bubble();
            ob.bubblesort(a);
        }}