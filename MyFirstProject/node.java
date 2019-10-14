
import java.io.*;
import java.util.*;
public class node
{
    int data;
    node link;
    int n;
    node start;
    node()
    {
       data=0;
       link=null;
       start=null;
      
    }
    void create() throws IOException
       {
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the first data");
        this.data=Integer.parseInt(br.readLine());
        System.out.println("Enter the number of nodes to be created");
        n=Integer.parseInt(br.readLine());
        node  temp;
        node ptr=this;
        for(int i=1;i<n;i++)
        {
            temp=new node();
            System.out.println("enter the next data");
            temp.data=Integer.parseInt(br.readLine());
            ptr.link=temp;
            temp=null;
            ptr=ptr.link;
            
        }   
       }    
     void insertbeg(int x)
     {
         //INSERTING A LIST IN THE BEGINING
        // node start=this;
         node temp=new node();
           node ptr=this;
         temp.data=x;
         temp.link=null;
         if(ptr==null)
         start=temp;
         else{
         temp.link=start;
         ptr=temp;
         temp=null;
        }
        
     } 
     void insertmid(node start ,int x)
     {
         //INSERTING A LIST IN THE MIDDLE OF THE LIST
         node temp=new node();
         System.out.println("Enter the element for the new list");
         temp.data=x;
         temp.link=null;
         node ptr=start;
         int c=0;
         while(c<=n)
         {
           ptr=ptr.link;
           c++;
           
         }  
         temp.link=ptr;
         ptr.link=temp;
        
     }
     
     void insertend(node start,int x)
     {
        //INSERTING A LIST AT THE END OF THE LIST
         node temp=new node();
         System.out.println("Enter the element for the new list");
         temp.data=x;
         temp.link=null;
         node ptr=start;
         while(ptr.link!=null)
         {
             ptr=ptr.link;
             temp=ptr=null;
         }
        
        
        
     }
     void display()
     {
         //DISPLAYING THE ELEMENTS OF THE LINKED LIST
         node ptr=this;
         while(ptr!=null)
         {
           System.out.print(ptr.data);
           System.out.print("--->");
           ptr=ptr.link;
            
         }  
         System.out.print("NULL");
         System.out.println();
         
     }  
     
     public static void main(String args[])throws IOException
     {
         int k,p,ch;
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         node first=new node();
         node abc=new node();
         do{
         System.out.println("main menu");
         System.out.println("1. Create a linked list structure");
         System.out.println("2 Insert a list in the begining");
         System.out.println("3 insert a list at the end");
         System.out.println("4 insert a list at the middle");
         System.out.println("Display");
         System.out.println("Enter choice");
         ch=Integer.parseInt(br.readLine());
          switch(ch)
         {
           case 1:
           first.create();
           break;
           case 2:
           System.out.println("Enter data for new node");
            k=Integer.parseInt(br.readLine());
           first.insertbeg(k);
           first.display();
           break;
           case 3:
           System.out.println("Enter data for new node");
           k=Integer.parseInt(br.readLine());
           first.insertend(first,k);
           case 4:
           System.out.println("Enter data for new node");
           k=Integer.parseInt(br.readLine());
           System.out.println("Enter node number after which node is to be inserted");
           p=Integer.parseInt(br.readLine());
           first.insertmid(first,k);
           break;
           case 5:
           System.out.println("Data in the linked list are");
           first.display();
           break;
         }    
        }while(ch!=6);
         
     }    
}
