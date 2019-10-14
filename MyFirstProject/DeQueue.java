import java.io.*;
class DeQueue{
public static final int MAXSIZE=100;
int  front =-1, rear =-1, n;
int queue[]=new int[MAXSIZE];

  /* insert an element into  front of thethe queue */
  void insertfrontqueue(int data,int size) 
  {
        if (rear==size-1)
                System.out.println("Queue is full\n");
        else {
        	  if (front==-1 && rear==-1)
        	  {
        	  	front=0;
        	  	rear=0;
        	  	queue[front] = data;
        	  
        	  }
        	  if(front==0)
                System.out.println("OverFlow at Front end");
              else{
              	front=front-1;
              		queue[front] = data;
              }
                
            
        }
    }
  /* insert an element into delete of thethe queue */
  void insertendqueue(int data,int size) {
        if (rear==size-1)
                System.out.println("Queue is full\n");
        else {
        	  rear=rear+1;
        	queue[rear]=data;
            
        }
      
  }


  /* delete an element from the queue */
  void deletefrontqueue() {
  	int val;
        if (front==-1 && rear==-1)
                System.out.println("Queue is Empty\n");
        else {
        	 val=queue[front];
        	System.out.println("Element Deleted"+val);
            if(front==rear)
            {
            	front=-1;
            	rear=-1;
            }
            else
            front = front + 1;
               
        }
  }
  /*delete an element from the queue */
  void deleterearqueue() {
  	int val;
        if (front==-1 && rear==-1)
                System.out.println("Queue is Empty\n");
        else {
        	 val=queue[rear];
        	System.out.println("Element Deleted"+val);
            if(front==rear)
            {
            	front=-1;
            	rear=-1;
            }
            else
            rear=rear-1;
               
        }
  }


  /* display elements present in the queue */
  void display() {
        int i, j = 0;
        System.out.println("Elements in queue:");
        for (i = front; i <= rear; i++)
                     System.out.println(" "+ queue[i]);
      
  }


  public static void main(String args[])throws IOException 
       {
        int data, ch;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        DeQueue obj=new DeQueue();
        System.out.println("Enter the size of the Queue:");
        int n=Integer.parseInt(br.readLine());
        do {
               System.out.println ("1. InsertFrontQueue\n 2. InsertRearQueue\n");
                System.out.println("3 DeleteFrontQueue 4.DeleteRearQueue\n");
                System.out.println("5 Display ");
                System.out.println("6. Exit \nEnter ur choice:");
                 ch=Integer.parseInt(br.readLine());
                switch (ch) {
                        case 1:
                                System.out.println("Enter the data to insert:");
                                 data=Integer.parseInt(br.readLine());
                                obj.insertfrontqueue(data, n);
                                break;
                        case 2:
                                 System.out.println("Enter the data to insert:");
                                data=Integer.parseInt(br.readLine());
                                obj.insertendqueue(data, n);
                                break;
                        case 3:
                                obj.deletefrontqueue();
                                break;
                        case 4:
                                obj.deleterearqueue();
                                break;

                        case 5:
                                obj.display();
                                break;
                       
                        default:
                                System.out.println("Please retry with correct option\n");
                                break;
                }

        }while(ch!=6);
    } 
  }