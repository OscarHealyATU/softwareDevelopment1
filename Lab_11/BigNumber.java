import java.util.Scanner;

/**
 * BigNumber
 */
public class BigNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        input.close();
        if (num < 1000000) {
            System.out.println("number is less than 1,000,000\n\n (=ಠ ل͟ ಠ=)\n\n");
        }else {
            System.out.println("number is greater than 1,000,000\n\n (▀̿Ĺ̯▀̿ ̿))\n\n");
        }
    }
}