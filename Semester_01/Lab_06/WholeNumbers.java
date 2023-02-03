package Semester_01.Lab_06;

import java.util.Scanner;

public class WholeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter a number: ");
        int number1 = input.nextInt();
        System.out.printf("Enter another number: ");
        int number2 = input.nextInt();
        
        input.close();

        System.out.printf("Numbers entered were " + number1 + " and "+number2);
        
    }
}
