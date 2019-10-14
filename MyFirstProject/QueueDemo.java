import java.io.*;
public class QueueDemo
{
    
     private static final int capacity = 3;  
 int arr[] = new int[capacity];  
 int front = -1,rear=-1;  
  
 public void insertqueue(int item) {  
  if (rear < capacity - 1) {  
      if(front==-1 && rear==-1){
        
          front=0;
          rear=0;
        }
        else{
            
            rear=rear+1;
        }
   arr[rear] =item;  
   System.out.println("Element " +item  
     + " is inserted to queue !");  
   printElements();  
  } else {  
   System.out.println("Queue Overflow !");  
  }  
 }  
  
 public void deletequeue() {  
  if (front==-1 && rear==-1) {  
     
   System.out.println("Queue Underflow !");  
    }
    else{
     int var=arr[front];
     if(front==rear){
         front=-1;
         rear=-1;
         
        }
        else
        {
         front=front+1;   
        }   
   System.out.println("Poped out element !"+var);  
  }
  }  
  
  
 public void printElements() {  
   
   System.out.println("Elements in Queue :");  
   for (int i =front; i <= rear; i++) {  
    System.out.println(arr[i]);  
  
  }  
 }  
  
 public static void main(String[] args) {  
  QueueDemo obj= new QueueDemo();  
  
   obj.deletequeue(); 
   obj.insertqueue(23);  
   obj.insertqueue(2);  
   obj.insertqueue(73);  
   obj.insertqueue(21);  
   obj.deletequeue();
   obj.printElements();
   obj.deletequeue();
   obj.printElements();
   obj.deletequeue();  
   obj.deletequeue();  
 }  
   
}
