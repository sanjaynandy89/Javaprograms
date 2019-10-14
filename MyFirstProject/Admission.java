
import java.io.*;
class Admission
{
    int adno[];
    Admission()
    {
        adno=new int[100];
        
    }
    void fillarray() throws IOException
    
    { BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter array element");
        for(int i=0;i<10;i++)
        {
            adno[i]=Integer.parseInt(br.readLine());
        }
        int t;
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<10-i-1;j++)
            { if(adno[j]>adno[j+1])
                {
                    t=adno[j];
                    adno[j]=adno[j+1];
                    adno[j+1]=t;
                    
                    
               
                
                
            }
            
            
        }
        
    }
}
    int binsearch(int l,int u,int v)
    {   int mid=(l+u)/2;
        if(u<l)
        {
            return -1;
        }
        if(adno[mid]==v)
             return 1;
        else if(adno[mid]>v)
              return binsearch(l,mid-1,v);
             else
              return binsearch(mid+1,u,v);
              
    }
    
    
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Admission ob=new Admission();
        ob.fillarray();
        System.out.println("enter the value to search");
        int v=Integer.parseInt(br.readLine());
        
        int x=ob.binsearch(0,9,v);
        if(x==1)
        {
          System.out.println("Search Succcessful");  
        }
        else
        {
            
        System.out.println("Search  UnSucccessful");      
        }
        
        
    }    

    
}