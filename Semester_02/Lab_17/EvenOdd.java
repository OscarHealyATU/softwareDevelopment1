package Semester_02.Lab_17;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
        String y;

        do {
            System.out.print("Enter a number: ");
            i = input.nextInt();
            if (i % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
            System.out.print("Enter Y to continue: ");
            y = input.next();
        } while (y.equals("y") || y.equals("Y"));
        input.close(); 

    }
}
