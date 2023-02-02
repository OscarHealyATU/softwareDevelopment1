package Semester_01.Lab_06;
import java.util.Scanner;

public class TwoStringsInput {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter first name: ");
    String fName = input.next();
    System.out.print("Enter last name: ");
    String lName = input.next();
    input.close();
    System.out.println("Numbers entered are: " + fName + lName);
  }
}


