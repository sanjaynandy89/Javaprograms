import java.io.*;
public class InsertionSort{
  public static void main(String a[])throws IOException{
  int i;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter the number of elements");
  int n=Integer.parseInt(br.readLine());
  int array[] = new int[n];
  
  System.out.println("Enter the elaments ");
  for(i=0;i<n;i++)
  {
  array[i]=Integer.parseInt(br.readLine());
  }
  System.out.println("Values Before the sort:\n");  
  for(i = 0; i < array.length; i++)
  System.out.print( array[i]+"  ");
  System.out.println();
  for ( i = 1; i < n; i++){
  int j = i;
  int B = array[i];
  while ((j > 0) && (array[j-1] > B)){
  array[j] = array[j-1];
  j--;
  }
  array[j] = B;
  }
   
  System.out.print("Values after the sort:\n");  
  for(i = 0; i <array.length; i++)
  System.out.print(array[i]+"  ");
  System.out.println(); 
 
  }

  
}