package Semester_01.Lab_06;

import java.util.Scanner;

public class DecimalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter a number: ");
        double number1 = input.nextDouble();

        System.out.printf("Enter another number: ");
        double number2 = input.nextDouble();        
        
        input.close();

        //System.out.printf("Numbers entered were %d%n" + number1 + " and " + number2);
    }
}
