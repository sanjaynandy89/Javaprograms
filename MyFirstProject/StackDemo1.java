
import java.io.*;
public class StackDemo1
{
    // instance variables - replace the example below with your own
    private static final int capacity = 100;  
 int arr[] = new int[capacity];  
 int top = -1;  
  
 public void push(int data,int size) {  
  if (top==size - 1) {  
      System.out.println("Stack Overflow !"); 
   
  } 
  else {  
    top++;  
   arr[top] = data;  
    
  }  
 }  
  
 public void pop(int data) {  
  if (top== -1) {  
       System.out.println("Stack Underflow !"); 
    
  } else {  
    int v; 
   v=arr[top];
   top--;  
   System.out.println("Poped out element !"+v);
  }  
 }  
  
 public void display(int data) {  
  if (top >= 0) {  
   System.out.println("Elements in stack :");  
   for (int i =top; i>=0; i--) {  
    System.out.println(arr[i]);  
   }  
  }  
 }  
 
  public static void main(String args[])throws IOException {
      int data, ch;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StackDemo1 obj=new StackDemo1();
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
                                obj.push(data, n);
                                break;
                        case 2:
                                obj.pop(n);
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
