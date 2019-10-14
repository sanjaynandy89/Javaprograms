import java.io.*;
import java.util.*;
class SrtingWordAscending
{
String s,str,sarr[],strarr[];
StringTokenizer st;
int i,j,n,c,index=0,fre[],index1=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
public void take() throws IOException
{

System.out.println("Enter the Paragraph:");
str=br.readLine();
st=new StringTokenizer(str,",.? ");
n=st.countTokens();
System.out.println("Number of Words in the paragraph="+n);
sarr=new String[n];
strarr=new String[n];
fre=new int[n];
while(st.hasMoreTokens())
{
sarr[index++]=st.nextToken();
}
for(i=0;i< index-1;i++)
{
for(j=i+1;j< index;j++)
{
if(sarr[i].compareTo(sarr[j]) > 0)
{
s=sarr[i];
sarr[i]=sarr[j];
sarr[j]=s;
}
}
}
System.out.println("Rearranged Sentence");
for(i=0;i< index;i++){
System.out.print(" "+sarr[i]);
}


}
}
