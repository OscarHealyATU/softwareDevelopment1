package Semester_02.Lab_18;

import java.util.Scanner;

public class Size {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = input.nextInt();
        input.close();
        if (size > 100 || size < 10) {
            System.out.println("Size is not available");
        } else if (size > 70) {
            System.out.println("Go for large size");
        } else if (size > 35) {
            System.out.println("Go for medium size");
        } else if (size >= 10) {
            System.out.println("Go for small size");
        }
        
    }
}
