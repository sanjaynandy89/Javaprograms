import java.io.*;
class TreeNode
{
     
       protected TreeNode left,right;
       protected int data;
       public TreeNode()
       {
          data=0;
          left=right=null;
          
       }
       public TreeNode(int n)
       {
          data=n;
          left=right=null;
          
       }
       public void disp()
       {
           System.out.println(data+" ");
       } 
       public void setLeft(TreeNode n)
       {
           left=n;
           
           
        } 
         public void setRight(TreeNode n)
       {
           right=n;
           
           
        }  
        public TreeNode getLeft()
       {
           return right;
           
           
        } 
         public TreeNode getRight()
       {
           return right;
           
           
        } 
        public void setData(int d)
       {
           data=d;
           
           
        } 
         public int getData()
       {
           return data;
           
           
        } 
        
    
}   
class BinaryTree
{
    TreeNode root;
    public BinaryTree()
    {
       root=null; 
    } 
    public void insert(int data)
    {
        
        root=insert(root,data);
        
    }  
    public boolean isEmpty()
    {
        return root==null;
    }    
    public TreeNode insert(TreeNode node,int data)//Insert New Node
    {
        if(node==null)
        node=new TreeNode(data);
        else
        {
            if(data<=node.data)//Insert at Left child
            node.left=insert(node.left,data);
            else//Insert at right child
            node.right=insert(node.right,data);
            
            
        }    
        return (node);
     } 
     public void Delete(int key)
     {
        if(isEmpty())
        System.out.println("Tree Empty");
        else if(Search(key)==false)
        System.out.println("Element not present");
        else
        {
            root=Delete(root,key);
            System.out.println(key+"deleted from the tree");
            
        }   
     }  
     private TreeNode Delete(TreeNode root,int key)
     {
         
         TreeNode p,p2,n;
         if(root.getData()==key)
         {
             TreeNode lt,rt;
             lt=root.getLeft();
             rt=root.getRight();
             if(lt==null && rt==null)
             {
               return null;    
                 
             } 
             else if(lt==null)
             {
               p=rt;
               return p;
             }  
             else if(rt==null)
             {
                p=lt;
                return p;
                 
             }  
             else
             {
                 
               p2=rt;
               p=rt;
               while(p.getLeft()!=null)
               p=p.getLeft();
               p.setLeft(lt);;
               return p2;
               
                 
             }    
            }    
            
            if(key<root.getData())//deleteleft
            {
               n=Delete(root.getLeft(),key);
               root.setLeft(n);
            } 
            else
            {
                n=Delete(root.getRight(),key);//deleteright
                root.setRight(n);
                
            }   
            return root;

     } 
     public int countNodes()
     {
        return countNodes(); 
     }   
     private int countNodes(TreeNode r)
     {
         if(r==null){
             return 0;
             
            }
            else
            {
             int l=1;
             l+=countNodes(r.getLeft());//countleftnode
             l+=countNodes(r.getRight());//countightnode
             return l;
            }
           
            
         
         
         
     }  
      public boolean Search(int value)
            {
                return Search(root,value);
            } 
      private boolean Search(TreeNode r,int val)
      {
          boolean Found=false;
          while((r!=null)&&!Found)
          {
              int rval=r.getData();
              if(val<rval)//move to leftsubtree
              {
                  r=r.getLeft();
              } 
              else if(val>rval)//move to rightsubtree
              r=r.getRight();
              else
              {
                  
                 Found=true;
                 break;
                  
                  
              }  
              Found=Search(r,val);
              
              
          }    
          return Found;
        }
        
        public void inorder()
        {
          inorder(root);  
        } 
        private void inorder(TreeNode r)
        {
            if(r!=null)
            {
            inorder(r.getLeft());//visit left
            System.out.println(r.getData()+"");//visit root
            inorder(r.getRight());//visit right
        }
            
        } 
        public void preorder()
        {
          preorder(root);  
        } 
        private void preorder(TreeNode r)
        {
            if(r!=null)
            {
                 System.out.println(r.getData()+"");//visitroot
            preorder(r.getLeft());//visitleft
            preorder(r.getRight());//visitright
        }
            
        }  
      public void postorder()
        {
          postorder(root);  
        } 
        private void postorder(TreeNode r)
        {
            if(r!=null)
            {
            postorder(r.getLeft());//visit left
            postorder(r.getRight());//visit right
            System.out.println(r.getData()+"");//visit root
        }
            
        }    
    
    
    
}
public class BTest
{
     protected static BinaryTree obj;
   public static void main(String args[])throws IOException
   {
      int data, ch;
      int num;
     
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        obj=new BinaryTree();
        
      
        do {
              System.out.println("Select a choice from the menu below.");
        System.out.println("1 Insert a node.");
        System.out.println("2. Search for a node.");
        System.out.println("3. Delete a node.");
        System.out.println("4. Display the Binary Search Tree.");
        System.out.println("Choice: ");
         ch=Integer.parseInt(br.readLine());
              switch(ch) {
            case 1: System.out.println("Enter an element: ");
                    data=Integer.parseInt(br.readLine());
                    obj.insert(data);
                    break;

            case 2: System.out.println("Enter the element to be searched for: ");
                    data= data=Integer.parseInt(br.readLine());
                    obj.Search(data);
                    break;

            case 3: System.out.println("Enter the element to be deleted: ");
                     data=Integer.parseInt(br.readLine());
                    obj.Delete(data);
                    break;

            case 4: System.out.println("Select an order for the elements to be display in.");
                    System.out.println(" 1.Pre-order.");
                    System.out.println(" 2.Post-order.");
                    System.out.println(".3.In-order.");
                    System.out.println("\nChoice: ");
                   int num1=Integer.parseInt(br.readLine());
                    switch(num1) {
                        case 1: System.out.println("Pre-order Display: ");
                                obj.preorder();
                                break;

                        case 2: System.out.println("Post-order Display: ");
                                obj.postorder();
                                break;

                        case 3: System.out.println("In-order Display: ");
                                obj.inorder();
                                break;

                        default: System.exit(0);
                    }
                    break;
                    
                    
                    
           case 5: System.exit(0);
           break;

            default: System.out.println("Wrong Choice");
            }
        
    } while(ch!=5);

       
   }     
}
/*Select a choice from the menu below.
1 Insert a node.
2. Search for a node.
3. Delete a node.
4. Display the Binary Search Tree.
Choice: 
1
Enter an element: 
8
Select a choice from the menu below.
1 Insert a node.
2. Search for a node.
3. Delete a node.
4. Display the Binary Search Tree.
Choice: 
1
Enter an element: 
5
Select a choice from the menu below.
1 Insert a node.
2. Search for a node.
3. Delete a node.
4. Display the Binary Search Tree.
Choice: 
1
Enter an element: 
10
Select a choice from the menu below.
1 Insert a node.
2. Search for a node.
3. Delete a node.
4. Display the Binary Search Tree.
Choice: 
3
Enter the element to be deleted: 

 Display the Binary Search Tree.
Choice: 
4
Select an order for the elements to be display in.
 1.Pre-order.
 2.Post-order.
.3.In-order.

Choice: 
1
Pre-order Display: 
8
10
10
Select a choice from the menu below.
1 Insert a node.
2. Search for a node.
3. Delete a node.
4. Display the Binary Search Tree.
Choice: 
2
Post-order Display: 
10
10
8
Select a choice from the menu below.
1 Insert a node.
2. Search for a node.
3. Delete a node.
4. Display the Binary Search Tree.
Choice: 
In-order Display: 
10
8
10
Select a choice from the menu below.
1 Insert a node.
2. Search for a node.
3. Delete a node.
4. Display the Binary Search Tree.
Choice: 
*/
