package Lab_21;

import java.util.Scanner;

public class SixthArray {
    public static void main(String[] args) {
        int[] x = {22,104,3,65,1002,90000,77,88,99,10};
        boolean checker = false;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter search number: ");
        int number = input.nextInt(), index = 0;
        input.close();
        for (int i = 0; i < x.length; i++) {
            if (x[i] == number) {
                checker = true;
                index = i;
            }
        }
        if (checker) System.out.println("Number is contained in array at index " + index);
        else System.out.println("Number is not contained in array");
    }
}
