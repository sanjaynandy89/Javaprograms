
/**
 * Write a description of class Derteminent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
public class Derteminent
{
 public static void main(String args[])throws IOException{
  int a[][]=new int[3][3];
  int i,j;
  int determinant=0;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enthe the elements");
  for(i=0;i<3;i++){
      for(j=0;j<3;j++){
           a[i][j]=Integer.parseInt(br.readLine());
        }
    }

  System.out.println("The First matrix is");
  for(i=0;i<3;i++){
    
      for(j=0;j<3;j++){
           System.out.print(a[i][j]);
        }
        System.out.println();
  }

  for(i=0;i<3;i++)
      determinant = determinant + (a[0][i]*(a[1][(i+1)%3]*a[2][(i+2)%3] - a[1][(i+2)%3]*a[2][(i+1)%3]));
    
  System.out.println("Determinant of matrix is: "+determinant);


   
}

}
