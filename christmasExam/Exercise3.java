package christmasExam;
import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ans;
        System.out.print("How many times have Brazil won the World Cup? ");
        ans = input.nextInt();
        if (ans == 5) {
            System.out.println("Correct");
        }else{
            System.out.println("Incorrect");
        }
        input.close();
    }
}