package Semester_01.Lab_06;
import java.util.Scanner;

public class Calculations {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a whole number for X: ");
        double number1 = input.nextDouble();
        System.out.print("Enter decimal number for Y: ");
        int number2 = input.nextInt();

        double sum = number1 + number2;
        input.close();
        System.out.println("X + Y = " + sum);
        sum = number1 * number2;
        System.out.println("X * Y = " + sum);
    }
}

