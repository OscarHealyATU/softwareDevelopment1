package Semester_01.Lab_10;
import java.util.Scanner;

/**
 * Question1
 */
public class Question1 {

    public static void main(String[] args) {
        //variables
        Scanner input = new Scanner(System.in);
        String ans;

        // input code
        
        System.out.println("\nThe following code produces which output to the screen:\n\n");
        System.out.println(" int x = 65;\n if(x > 65){\n\tSystem.out.println(x);\n}");
        System.out.println("\n\n is it \nA.|\t65 \nB.|\tNothing is printed to the screen");
        ans = input.next();

        // Answer decision
        if (ans.equals("a")) {
          
            System.out.println("correct!");
        }else {
          
            System.out.println("incorrect!");
        }
        input.close();
       
    }
}