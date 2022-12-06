import java.util.Scanner;

/**
 * Question1
 */
public class Question1 {

    public static void main(String[] args) {
        //variables
        boolean q1 = false;
        int count = 0;
        Scanner input = new Scanner(System.in);
        String ans;

        // input code
        
        System.out.println("\nThe following code produces which output to the screen:\n\n");
        System.out.println(" int x = 65;\n if(x > 65){\n\tSystem.out.println(x);\n}");
        System.out.println("\n\n is it \nA.|\t65 \nB.|\tNothing is printed to the screen");
        ans = input.next();

        // Answer decision
        if (ans.equals("a")) {
            q1 = true;
            System.out.println("correct!");
        }else {
            q1 = false;
            System.out.println("incorrect!");
        }
        input.close();
       
    }
}