import java.util.Scanner;

/**
 * FirstIfs
 */
public class FirstIfs {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();
        System.out.println("Enter a value.");
        if (value == 1) {
            System.out.println("value is equal to 1");
        }
        if (value != 1) {
            System.out.println("value is not equal to 1");
        }
        if (value > 1) {
            System.out.println("value is greater than 1");
        }
        if (value < 1) {
            System.out.println("value is less than 1");
        }

        input.close();
    }
}