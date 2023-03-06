package Lab_019;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter your first name");
         String name = input.next();
         System.out.println("Enter whhole number");
         int number  = input.nextInt();
         System.out.println("Enter decimal number");
         double decNum = input.nextDouble(); 
         input.close();

         System.out.println(name + ", you entered the numbers " + number + " and " + decNum + ".");
         
    }
}
