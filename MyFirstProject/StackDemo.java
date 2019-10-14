
/**
 * Write a description of class stack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class StackDemo
{
     private static final int capacity = 3;  
 int arr[] = new int[capacity];  
 int top = -1;  
  
 public void push(int pushedElement) {  
  if (top < capacity - 1) {  
   top++;  
   arr[top] = pushedElement;  
   System.out.println("Element " + pushedElement  
     + " is pushed to Stack !");  
   printElements();  
  } else {  
   System.out.println("Stack Overflow !");  
  }  
 }  
  
 public void pop() {  
  if (top >= 0) {  
   int v; 
   v=arr[top];
   top--;  
   System.out.println("Poped out element !"+v);  
  } else {  
   System.out.println("Stack Underflow !");  
  }  
 }  
  
 public void printElements() {  
  if (top >= 0) {  
   System.out.println("Elements in stack :");  
   for (int i = 0; i <= top; i++) {  
    System.out.println(arr[i]);  
   }  
  }  
 }  
  
 public static void main(String[] args) {  
  StackDemo StackDemo = new StackDemo();  
  
  StackDemo.pop();  
  StackDemo.push(23);  
  StackDemo.push(2);  
  StackDemo.push(73);  
  StackDemo.push(21);  
  StackDemo.pop();  
  StackDemo.pop();  
  StackDemo.pop();  
  StackDemo.pop();  
 }  
  
}  

