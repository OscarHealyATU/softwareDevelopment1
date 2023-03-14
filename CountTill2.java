import java.util.Scanner;

public class CountTill2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Define the denominations
        int[] denominations = {1, 2, 5, 10, 20, 50, 100};

        // Get the number of coins/notes of each denomination
        int[] counts = new int[denominations.length];
        for (int i = 0; i < denominations.length; i++) {
            System.out.print("Enter the number of " + denominations[i] + " euro coins/notes: ");
            counts[i] = input.nextInt();
        }

        // Calculate the total amount of money
        double total = 0;
        for (int i = 0; i < denominations.length; i++) {
            total += counts[i] * denominations[i];
        }

        // Calculate the amount of float
        double floatAmount = total - 300;

        // Calculate the ideal change for the float
        int[] changeCounts = new int[denominations.length];
        for (int i = denominations.length - 1; i >= 0; i--) {
            int count = (int) (floatAmount / denominations[i]);
            changeCounts[i] = Math.min(count, counts[i]);
            floatAmount -= changeCounts[i] * denominations[i];
        }

        // Output the results
        System.out.println("Total amount of money in till: " + total + " euros");
        System.out.println("Amount of float: " + (total - 300) + " euros");
        System.out.println("Ideal change for the float:");
        for (int i = 0; i < denominations.length; i++) {
            if (changeCounts[i] > 0) {
                System.out.println(changeCounts[i] + " x " + denominations[i] + " euro coins/notes");
            }
        }
        input.close();
    }
}
