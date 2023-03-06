package Lab_019;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" enter number 1");
        int num1 = input.nextInt();
        System.out.println(" enter number 2");
        int num2 = input.nextInt();
        input.close();

        System.out.println( num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println( num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println( num1 + " - " + num2 + " = " + (num1 - num2));

    }
}
