package Semester_02.Lab_17;
import java.util.Scanner;

public class SumAgain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1;

        while (i == 1) {
            System.out.print("Enter a first number: ");
            int num = input.nextInt(); 
            System.out.print("Enter a first number: ");
            int sum = input.nextInt(); 
            sum += num; 
            System.out.println("sum of numbers: " + sum);
            System.out.print("loop again: (1 for yes 2 for no): ");
            i = input.nextInt(); 
        }
        System.out.println("finished looping.");
        input.close();
    }
}

