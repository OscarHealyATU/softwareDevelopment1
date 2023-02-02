package Semester_01.Lab_06;
import java.util.Scanner;

public class OneNumberInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        input.close();
        System.out.println("Number entered: " + number);
    }
}
