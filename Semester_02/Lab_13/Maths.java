package Lab_13;

import java.util.Scanner;

public class Maths {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value1, value2, result, choice;
        System.out.print("Enter first number: ");
        value1 = input.nextInt();
        System.out.print("\nEnter second number: ");
        value2 = input.nextInt();

        System.out.println("\nwhat aritmetic would you like to perform on these numbers");
        System.out.print("1. Addition\n2. Subrtaction\n3. Multiplication\n4. Division\nEnter choice (1-4): ");
        choice = input.nextInt();

        input.close();

        switch (choice) {
            case 1:
                result = value1 + value2;
                System.out.println(value1 + " + " + value2 + " = " + result);
                break;
            case 2:
                result = value1 - value2;
                System.out.println(value1 + " - " + value2 + " = " + result);
                break;
            case 3:
                result = value1 * value2;
                System.out.println(value1 + " * " + value2 + " = " + result);
                break;
            case 4:
                result = value1 / value2;
                System.out.println(value1 + " / " + value2 + " = " + result);
                break;
        
            default:
            System.out.println("invalid choice");
                break;
        }
    }
}
