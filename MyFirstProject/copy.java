class copy
{

public void test (int count )
{
if ( count == 0)
System.out.println(" end" );
else
{ 
    System.out.println( "Bye" + count);
test( --count );
System.out.println("test "+ count);
}
}
public static void main(String args[])
{
    copy ob=new copy();
    ob.test(4);
    
}    
}