package Semester_02.Lab_17;
import java.util.Scanner;

public class ReadSetIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1, num = 0, oddSum = 0, evenSum = 0;

        while (i == 1) {      
            System.out.print("Enter number: "); 
            num = input.nextInt();
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
            System.out.print("loop again: (1 for yes 2 for no): ");
            i = input.nextInt(); 
        }
        input.close();
        
        System.out.println("sum of even numbers: " + evenSum);
        System.out.println("sum of even numbers: " + oddSum);
        
    }
}
