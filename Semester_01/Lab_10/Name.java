package Semester_01.Lab_10;
import java.util.Scanner;

/**
 * Name
 */
public class Name {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a name and we'll check if its the same as mine");
        String myName = "Oscar",
               nameStr = input.next();
        input.close();
        System.out.print("\nName entered is " + nameStr + " ");
        if (nameStr.equals(myName)) {
            System.out.println("it is the same as " + myName);
        } 
       System.out.println("it is not the same as " + myName);
       
    }
}