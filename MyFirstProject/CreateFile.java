import java.io.*;
public class CreateFile
{
    public static void main(String args[])throws IOException
    {
          
        DataInputStream dis=new DataInputStream(System.in);
        FileOutputStream fout=new FileOutputStream("myFile.txt");
        System.out.println("Enter the text");
        char ch;
        while((ch=(char)dis.read())!='@')
        fout.write(ch);
        fout.close();
        
    }    
}
