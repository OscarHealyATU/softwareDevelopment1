import java.util.Scanner;

public class CountTill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total=0;
        double cent5 = 0, cent10 = 0, cent20= 0, cent50 = 0;
        double euro1 = 0, euro2 = 0, euro5 = 0, euro10 = 0, euro20 = 0, euro50 = 0, euro100 = 0;

        // Get the number of coins of each denomination
        System.out.print("Enter 5 cent coins: ");
        total += input.nextDouble() * 0.05;
        System.out.print("Enter 10 cent coins: ");
        total += input.nextDouble() * 0.10;
        System.out.print("Enter 20 cent coins: ");
        total += input.nextDouble() * 0.20;
        System.out.print("Enter 50 cent coins: ");
        total += input.nextDouble() * 0.50;
        System.out.print("Enter 1 euro coins: ");
        total += input.nextDouble();
        System.out.print("Enter 2 euro coins: ");
        total += input.nextDouble() * 2;
        System.out.print("Enter 5 euro notes: ");
        total += input.nextDouble() * 5;
        System.out.print("Enter 10 euro notes: ");
        total += input.nextDouble() * 10;
        System.out.print("Enter 20 euro notes: ");
        total += input.nextDouble() * 20;
        System.out.print("Enter 50 euro notes: ");
        total += input.nextDouble() * 50;
        System.out.print("Enter 100 euro notes: ");
        total += input.nextDouble() * 100;
        input.close();
               
        // Calculate the amount of float
        double takings = total - 300;
        double totalTaking = takings;
        System.out.println(takings + " this is takings");
        while (takings >= 0) {
              if (takings > 100) {
                takings -= 100;
                euro100++;
              } else if (takings > 50) {
                takings -= 50;
                euro50++;     
              } else if (takings > 20) {
                takings -= 20;
                euro20++;
              } else if (takings > 10) {
                takings -= 10;
                euro10++;
              } else if (takings > 5) {
                takings -= 5;
                euro5++;
              } else if (takings > 2) {
                takings -= 2;
                euro2++;
              } else if (takings > 1) {
                takings -= 1;
                euro1++;
              } else if (takings > 0.50) {
                takings -= 0.50;
                cent50++;
              } else if (takings > 0.20) {
                takings -= 0.20;
                cent20++;
              } else if (takings > 0.10) {
                takings -= 0.10;
                cent10++;
              } else {
                takings -=0.05;
                cent5++;
                break;
              }

              
        }
        // Output the results
        System.out.println("Total: " + total + " euros");
        System.out.println("Takings: " + totalTaking + " euros");
        System.out.println("Take: ");
        System.out.println("100 euro: " + euro100 + "\n50 euro: " + euro50 + "\n20 euro: " + euro20 + "\n10 euro: " + euro10
         + "\n5 euro: " + euro5 + "\n2 euro: " + euro2 + "\n1 euro: " + euro1 + "\n50 cents: " + cent50 
         + "\n20 cents: " + cent20 + "\n10 cents: " + cent10+ "\n5 cents: " + cent5 + "\n");
    }
}
