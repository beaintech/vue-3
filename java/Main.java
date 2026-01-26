// abstract class
abstract class MainApp {
  public String fname = "Jessica";
  public int age = 29;
  public abstract void study(); // abstract method 
}

// Subclass (inherit from Main)
class Student extends MainApp {
  public int graduationYear = 2088;
  public void study() { // the body of the abstract method is provided here
    System.out.println("Studying all day long");
  }
}

// New class with main method
public class Main {
  public static void main(String[] args) {
    Student student = new Student();
    System.out.println("Name: " + student.fname);
    System.out.println("Age: " + student.age);
    System.out.println("Graduation Year: " + student.graduationYear);
    student.study();
  }
}