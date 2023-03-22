package Lab_21;

import java.util.Scanner;

public class Namess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String[] names = {input.nextLine(),"",""};
        System.out.print("Enter Second name: ");
              names[1] = input.nextLine();
        System.out.print("Enter Third name: ");
              names[2] = input.nextLine(); 
              input.close();       

        System.out.println("Names\n------\n" + names[0] + "\n" + names[1] + "\n" + names[2] + "\n");
    }
}
