package Lab_14;
import java.util.Scanner;

public class EightLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int count = 1, ans,
            value = input.nextInt();
        input.close();

        while(count <= 5) {
            ans = value * count;
            System.out.println(value + " time " + count + " = " + ans);
            count++;
        }
    }
}
