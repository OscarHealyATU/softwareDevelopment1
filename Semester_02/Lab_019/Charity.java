package Lab_019;

import java.util.Scanner;

public class Charity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String gift= "";

        System.out.print("Enter your name: ");
        String name = input.next();
        System.out.print("Enter donation amount: ");
        int donation = input.nextInt(); input.close();

        //if statement
        if (donation>20 && donation<30) { donation*=3;} 
        else if (donation<20) {gift = "book";} 
        else if (donation<40) {gift = "clothes voucher";} 
        else if (donation>=40) {gift = "food hamper";}

        System.out.println("Thanks " + name + " for your donation. We will use it to purchase a " 
        + gift + " for a person in need");
    }
}
