import java.util.Scanner;

public class Wages {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 1;
        double hoursWorked, rate, total;

        while (count <=3) {
            System.out.printf("Enter number of hours worked :");
            hoursWorked = input.nextDouble(); 
            System.out.printf("Enter hourly wage :");
            rate = input.nextDouble(); 

            if (hoursWorked > 40) {
                total = rate * 40;
                hoursWorked-=40;
                rate*=1.5;
                total+=rate*hoursWorked;
            } else {
                total = rate*hoursWorked;
            }
            System.out.println("Pay for employee " + count + " is :" + total + "\n");
            count++;
        }
        input.close();
        
    }
}
