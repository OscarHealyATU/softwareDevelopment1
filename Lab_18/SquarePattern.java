package Lab_18;

import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size: ");
        int length = input.nextInt();
        input.close();
        for (int row = 0; row < length; row++) {
            for (int column = 0; column < length; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
