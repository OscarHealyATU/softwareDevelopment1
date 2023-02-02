package Semester_01.Lab_06;
import java.util.Scanner;

public class TwoNumbersInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter last number: ");
        int number2 = input.nextInt();
        input.close();
        System.out.println("Numbers entered are: " + number1 + " and " + number2);
    }
}
