public class Toy
{
String toyID;
  String memberID;
  String description;
  int minAge;
  char status;
  double dailyRate;
  String borrowDate;
 
  public Toy(String toyID, String description, int minAge, double dailyRate, String status, String memberID, String hireDate)
  {
    status = "U";
  }
 
  public Toy(String toyID, String description, int minAge, double dailyRate, String status){
    status = "A";
  }
 public static void main(String args[])
    {
   
 Toy[] toys = new Toy[10];
toys[0] = new Toy("TOY022", "Train Set", 2, 0.30, "A");
toys[1]= new Toy("TOY093", "Snake Rattle", 0, 0.10, "U", "MEM012", "23/02/2012");
toys[2]= new Toy("TOY837", "Home Science Kit", 5, 0.50, "A");
for (int j = 0; j < toys.length; j++) {
  System.out.printf(toys[j].toyID, toys[j].description, toys[j].minAge);
}
}
}

