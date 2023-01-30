package Semester_01.Lab_10;
import java.util.*;/**
 * Question4
 */
public class Question4 {

    public static void main(String[] args) {
        //variables
        String ans;

         // input code
         Scanner input = new Scanner(System.in);
         System.out.println("\nint x = 1;\n\nif (x != 1) {\n\tSystem.out.println('not equal to 1');\n} else {\n\tSystem.out.println('equal to 1');\n}\n\n");
         System.out.println("Is it \nA.|\t not equal to 1 \nB.|\t equal to 1 \nC.|\t no output\nD.|\t error\n");
         ans = input.next();

         switch (ans) {
            case "a":
                System.out.println("incorrect!");
                break;
                case "b":
                System.out.println("correct!");
                break;
                case "c":
                System.out.println("incorrect!");
                break;
                case "d":
                System.out.println("incorrect!");
                break;
         
            default:
                break;
         }
         input.close();
    }
}