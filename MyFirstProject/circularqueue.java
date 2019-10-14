import java.io.*;
class circularqueue
{
    int front=-1;int rear=-1;int size;
    int a[]=new int [size];
    void insert(int item,int size)
    
    {
        if((front==0)&&(rear==size-1)||(front==rear+1))
        {
            System.out.println("overflow");
        }
        else
        {
        if(front==-1&&rear==-1)
        {
            front=0;
            rear=0;
            
        }
        else{
        if(rear==size-1)
        {rear=0;
        }
        else
        {
           rear=rear+1; 
        }
        
         }
        a[rear]=item;
        System.out.println(rear);
    }
    }
    void delete(int size)
    {
        if(front==-1)
        {
            System.out.println("underflow");
        }
        else
        {
            int item=a[front];
            if(front==rear)
            {front=-1;
                rear=-1;
                
            }
            else
            {
                if(front==size-1)
                {
                   front=0; 
                }
                else
                {
                  front=front+1;  
                }
                System.out.println("element deleted="+item);
                
            }
            
        }
    }    
        void display(int size)
        {
            for(int i=front;i<=rear;i++)
            {
                System.out.println(a[i]);
            }
            
            
        }

       public static void main  ()throws IOException
      {int data, ch;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        queue obj=new queue();
        System.out.println("Enter the size of the Queue:");
        int n=Integer.parseInt(br.readLine());
        do {   System.out.println();
               System.out.println ("1.Insert\n 2.Delete\n");
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
    
    
    
    
    
