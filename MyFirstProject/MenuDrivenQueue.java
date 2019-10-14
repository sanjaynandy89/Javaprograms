
import java.io.*;
public class MenuDrivenQueue
{

public static final int MAXSIZE=100;
int  front =-1, rear =-1, n;
int queue[]=new int[MAXSIZE];

 
  /* insert an element into delete of thethe queue */
  void insertqueue(int data,int size) {
        if (rear==size-1)
                System.out.println("Queue is full\n");
        else if(front==-1 && rear==-1){
        
          front=0;
          rear=0;
        }
        else{
            rear=rear+1;
        	
            
        }
      queue[rear]=data;
  }

  /*delete an element from the queue */
  void deletequeue() {
  	int val;
        if (front==-1 && rear==-1L)
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
        MenuDrivenQueue obj=new MenuDrivenQueue();
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
                                obj.deletequeue();
                                break;
                        case 3:
                                obj.display();
                                break;
                        case 4:System.exit(0);
                       
                        default:
                                System.out.println("Please retry with correct option\n");
                                break;
                }

        }while(ch!=4);
    } 
  }

