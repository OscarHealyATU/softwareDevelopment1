package Lab_019;

import java.util.Scanner;
public class NumberRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 10 and 20");
        int number = input.nextInt(); 
        input.close();

        if (number > 10 && number <20) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }
    }
}
