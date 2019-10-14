import java.io.*;
public class MergeFile
{
    public static void main(String args[])throws IOException
    {
        
        String name="",reg="";
        int m=0,n=0,p;
        String name1[]=new String[100];
        String reg1[]=new String[100];
        //Top Open existing file Registration.txt
        FileReader fr1=new FileReader("D:/Registration.txt");
        BufferedReader br1=new BufferedReader(fr1);
         //Top Open existing file Name.txt
           FileReader fr2=new FileReader("D:/Name.txt");
        BufferedReader br2=new BufferedReader(fr2);
        //Top Open existing file Name.txt
        FileWriter fr3=new FileWriter("D:/Admission1.txt");
         BufferedWriter br3=new BufferedWriter(fr3);
        PrintWriter pr=new PrintWriter(br3);
        //Reading From "Name.txt"
        while(((name=br2.readLine())!=null))
        {
            name1[m]=name;
            m++;
        }    
        
        //Reading From "Registration.txt"
        while(((reg=br1.readLine())!=null))
        {
            reg1[n]=reg;
            n++;
        }    
        //Merging the records of the both file
        for(p=0;p<m;p++)
        {
            
           String str=name1[p]+" "+reg1[p];
           pr.println(str);
            
        }  
        br1.close();
        br2.close();
        br3.close();
        
    }
}
