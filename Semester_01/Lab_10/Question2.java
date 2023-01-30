package Semester_01.Lab_10;
import java.util.*;
/**
 * Question2
 */
public class Question2 {

    public static void main(String[] args) {
          //variables
          String ans;

        // input code
        Scanner input = new Scanner(System.in);
        System.out.println("\nWrite a line of code to assign an isntance of the Scanner object for user input to a variable named sc:\n");
        ans = input.nextLine();

        if (ans.equals("Scanner sc = new Scanner(System.in);")) {
        
            System.out.println("correct!");
        }else {
            System.out.println("incorrect!");
        }
        
        input.close();
    }
}