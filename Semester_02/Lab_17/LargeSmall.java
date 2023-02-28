package Semester_02.Lab_17;
import java.util.Scanner;

public class LargeSmall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1, small = 0, large = 0, num = 0;
        while (i == 1) {
            System.out.print("enter number: ");
            num = input.nextInt();
            input.close();
            if (large < num) {
                large = num;
                System.out.println("large: " + num);
            }
            if (small > num) {
                small = num;
                System.out.println("nah");
            }

        }
    }
}
