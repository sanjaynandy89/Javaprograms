
import java.io.*;
class queue
{   int size=100;
    int arr[]=new int[size];
    int front=-1;int rear=-1;
    void insert(int data,int size)
    {
        
        
        if(rear==size-1)
        {
            System.out.println("overflow");
            
            
        }else
        {
            if(front==-1&&rear==-1)
            {
                front=0;
                rear=0;
            }
            else
            {
                rear=rear+1;
            }
            arr[rear]=data;
            
        }
        
    }
    void delete(int data)
    {
        if(front==-1&&rear==-1)
        {
            System.out.println("underflow");
        }
        else
        {int var=arr[front];
            if(front==rear)
            {
                front=-1;
                rear=-1;
                
            }
         else
        {
          front=front+1;  
        }
        System.out.println("element delete="+var);
            
    }
        
    }
        
    void display(int size)
    {
        System.out.println("elements are");
        for(int i=front;i<=rear;i++)
        {
            System.out.print(arr[i]+" ");
            
        }
      
        
    }
      public static void main  ()throws IOException
      {int data, ch;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        queue obj=new queue();
        System.out.println("Enter the size of the Queue:");
        int n=Integer.parseInt(br.readLine());
        do {
               System.out.println ("1.Push\n 2.Pop\n");
                System.out.println("3 Display ");
                System.out.println("4. Exit \nEnter ur choice:");
                 ch=Integer.parseInt(br.readLine());
                switch (ch) {
                        case 1:
                                System.out.println("Enter the data to push:");
                                 data=Integer.parseInt(br.readLine());
                                obj.insert(data, n);
                                break;
                        case 2:
                                obj.delete(n);
                                break;
                        case 3:
                                obj.display(n);
                                break;
                        case 4:System.exit(0);
                       
                        default:
                                System.out.println("Please retry with correct option\n");
                                break;
                }

        }while(ch!=4);
        
  }
}

      
    
