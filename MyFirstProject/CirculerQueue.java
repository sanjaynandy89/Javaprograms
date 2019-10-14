import java.io.*;
class CirculerQueue{
public static final int MAXSIZE=100;
int  front =-1, rear =-1, n;
int queue[]=new int[MAXSIZE];
  /* insert an element into the queue */
  void insertqueue(int data,int size) {
        if (front==0 && rear==size-1|| front==rear+1){
        	 System.out.println("Queue is full");
        }
        else {
        	  if (front==-1 && rear==-1)
        	  {
        	  	front=0;
        	  	rear=0;
        	  }
        	  else if(rear==size-1)
        	     rear=0;
        	    else
                rear = rear + 1;
        	   queue[rear]=data;
        	  
        	  
            
        }
  }

  /* delete an element from the queue */
  void deletequeue(int size) {
  	int val;
        if (front==-1 && rear==-1)
                System.out.println("Queue is Empty\n");
        else {
        	queue[front]=0;
        	if(front==size-1)
        	front=0;
        	else
        	{
        		if(front==rear)
            {
            	front=-1;
            	rear=-1;
            }
            else
            front = front + 1;
        	}
        	
            
               
        }
  }


  /* display elements present in the queue */
  void display(int size) {
        int i, j = 0;
        System.out.println("Elements in queue:");
        for (i = 0; i <size; i++)
          System.out.println(queue[i]);
       
  }


  public static void main(String args[])throws IOException {
      int data, ch;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        CirculerQueue obj=new CirculerQueue();
        System.out.println("Enter the size of the Queue:");
        int n=Integer.parseInt(br.readLine());
        do {
               System.out.println ("1. InsertQueue\n 2.DeleteQueue\n");
                System.out.println("3 Display ");
                System.out.println("4. Exit \nEnter ur choice:");
                 ch=Integer.parseInt(br.readLine());
                switch (ch) {
                        case 1:
                                System.out.println("Enter the data to insert:");
                                 data=Integer.parseInt(br.readLine());
                                obj.insertqueue(data, n);
                                break;
                        case 2:
                                obj.deletequeue(n);
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

