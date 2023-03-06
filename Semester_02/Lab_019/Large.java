package Lab_019;

import java.util.Scanner;

public class Large {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" enter number of numbers: ");

        int length = input.nextInt();
        int large =0;
        int note = 0;

        for (int i = 1; i <= length; i++) {
                System.out.print("enter integer " + i + ": ");
                int number = input.nextInt();

                if(number > large) {
                    large = number;
                    note = i;
                }
        }
        input.close();
        System.out.println("\nLargest interger is integer " + note + ": " + large);
    }
}