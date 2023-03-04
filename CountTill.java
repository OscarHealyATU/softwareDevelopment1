import java.util.Scanner;

public class CountTill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cent5, cent10, cent20, cent50;
        double euro1, euro2, euro5, euro10, euro20, euro50, euro100;

        /* Get the number of coins of each denomination
        System.out.print("Enter 5 cent coins: ");
        cent5 = input.nextDouble() * 0.05;
        System.out.print("Enter 10 cent coins: ");
        cent10 = input.nextDouble() * 0.10;
        System.out.print("Enter 20 cent coins: ");
        cent20 = input.nextDouble() * 0.20;
        System.out.print("Enter 50 cent coins: ");
        cent50 = input.nextDouble() * 0.50;
        System.out.print("Enter 1 euro coins: ");
        euro1 = input.nextDouble();
        System.out.print("Enter 2 euro coins: ");
        euro2 = input.nextDouble() * 2;
        System.out.print("Enter 5 euro notes: ");
        euro5 = input.nextDouble() * 5;
        System.out.print("Enter 10 euro notes: ");
        euro10 = input.nextDouble() * 10;
        System.out.print("Enter 20 euro notes: ");
        euro20 = input.nextDouble() * 20;
        System.out.print("Enter 50 euro notes: ");
        euro50 = input.nextDouble() * 50;
        System.out.print("Enter 100 euro notes: ");
        euro100 = input.nextDouble() * 100;
        input.close();*/

        // Calculate the total amount of money
        double[] denAmounts = {cent5, cent10, cent20, cent50, euro1, euro2, euro5, euro10, euro20, euro50, euro100};
        double[] floatAmount = { 2.5, 5, 10, 10, 25, 15, 30, 30, 60, 60, 50, 0};
        double total = euro1 + euro2 + euro5 + euro10 + euro20 + euro50 + euro100 + cent5 + cent10 + cent20 + cent50;
        // Calculate the amount of float
        double takings = total - 300;
        while (takings >= 0) {
              int i = 0;
              while (denAmounts[i] >= 0) {
                
              }
        }
        // Output the results
        System.out.println("Total: " + total + " euros");
        System.out.println("Takings: " + takings + " euros");
        System.out.println("Take: ");
    }
}
