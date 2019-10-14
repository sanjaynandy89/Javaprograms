import java.io.*;
class MatrixPrime
{


int m,n,i,j;
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
        int a[][] = new int[100][100];
        void input()throws IOException{
            System.out.println("Enter row and column");
           
             m = Integer.parseInt(br.readLine());
             n =  Integer.parseInt(br.readLine());
        
        System.out.println("Enter " + (m*n) + " elements: ");
            for(i=0;i< m;i++){
                for(j=0;j< n;j++){
                    
                    a[i][j] = Integer.parseInt(br.readLine());
                }
            }
            
        }
        int isPrime(int p){
            int c=0;
            for(i=1;i<=p;i++)
            {
                
                if(p%i==0)
                c++;
                
                
                
            }
            if(c==2)
            return 1;
            else 
            return 0;
            
            
        }
        void display(){
            int p1=0;
            int q1=0;
            System.out.println("Original Matrix: ");
            for(i=0;i< m;i++){
                for(j=0;j< n;j++){
                System.out.print(a[i][j]+ " "); 
                }
                System.out.println();
            }
            for(i=0;i<m;i++){
                for(j=0;j<n;j++){
                    p1=a[i][j];
                 q1=isPrime(p1);
                if(n==1)
                System.out.print("prime \t ");
                else
                System.out.print(" Not prime \t ");
                n=0;
                }
               System.out.println();
            }
            
        }
            
        public static void main(String args[])throws IOException
        {
            
            
            MatrixPrime obj=new MatrixPrime();
            obj.input();
            obj.display();
            
            
        }
            
            
        }