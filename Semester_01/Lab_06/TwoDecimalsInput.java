package Semester_01.Lab_06;
import java.util.Scanner;

public class TwoDecimalsInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter last number: ");
        double number2 = input.nextDouble();
        input.close();
        System.out.println("Numbers entered are: " + number1 + " and " + number2);
    }
}
