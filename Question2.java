import java.util.*;
/**
 * Question2
 */
public class Question2 {

    public static void main(String[] args) {
          //variables
          boolean q2 = false;
          int count = 0;
          String ans;

        // input code
        Scanner input = new Scanner(System.in);
        System.out.println("\nWrite a line of code to assign an isntance of the Scanner object for user input to a variable named sc:\n");
        ans = input.nextLine();

        if (ans.equals("Scanner sc = new Scanner(System.in);")) {
        
            q2 = true;
            count ++;
            System.out.println("correct!");
        }else {
            System.out.println("incorrect!");
        }
        
        input.close();
    }
}