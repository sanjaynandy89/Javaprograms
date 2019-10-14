import java.util.*;
class Student
{
   int id;
   String name;
   String city;
   double marks;
   Student(int id,String name,String city,double marks)
   {
     id=this.id;
     name=this.name;
     city=this.city;
     marks=this.marks;
   } 
   void setId(int id)
   {
      this.id=id;
      
       
   }  
   int getId()
   {
     return id;    
   } 
   
    void setName(String name)
   {
      this.name=name;
      
       
   }  
   String getName()
   {
     return name;    
   } 
   void setCity(String city)
   {
      this.city=city;
      
       
   }  
   String getCity()
   {
     return city;    
   } 
   void setMarks(double marks)
   {
      this.marks=marks;
      
       
   }  
   double getMarks()
   {
     return marks;    
   } 
   
}    
public class Solution
{   public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of students");
    int n=sc.nextInt();
    Student[] ob=new Student[n];
    int id;String name;String city;double marks;
    System.out.println("Enter the Details");
    for(int i=0;i<n;i++)
    {   
        id=sc.nextInt();
        name=sc.next();
        city=sc.next();
        marks=sc.nextDouble();
        ob[i]=new Student(id,name,city,marks);
        System.out.println(ob[i].getId());
    }
    for(Student s:ob)
    {
      System.out.println(s.getId());
    }
}
}
