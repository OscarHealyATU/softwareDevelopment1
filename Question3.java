import java.util.*;
/**
 * Question3
 */
public class Question3 {

    public static void main(String[] args) {

        //variables
        boolean q3 = false;
        int count = 0;
        String ans;

         // input code
         Scanner input = new Scanner(System.in);
         System.out.println("\nint x = 1;\nint y = 2;\n\nif(x == 1 && y == 2) {\n\tSystem.out.println(true);\n} else {\n\tSystem.out.println(false);\n}\n\n");
         System.out.println("Is it \nA.|\t false \nB.|\t true \nC.|\t no output\n");
         ans = input.next();

         switch (ans) {
            case "a":
                System.out.println("incorrect!");
                break;
                case "b":
                count ++;
                q3 = true;
                System.out.println("correct!");
                break;
                case "c":
                System.out.println("incorrect!");
                break;
         
            default:
                break;
         }
         input.close();
    }
}