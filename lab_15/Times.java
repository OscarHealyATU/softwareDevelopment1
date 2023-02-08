import java.util.Scanner;

public class Times {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number ");
        int number = input.nextInt();
        System.out.println("Select an option 1 or 2\n");
        System.out.println("1. Output addition table (1 to 12) for number entered");
        System.out.println("2. Output multiplication table (1 to 12) for number entered\n");
        System.out.print("Enter a choice: ");
        
        int decision = input.nextInt();

        input.close();

        int count = 0;
        int total;
        if (decision == 1) {
            while (count < 12) {
                count++;
                total = number+count;
                System.out.println(number + " + " + count + " = " + total);
            }
        } else if (decision == 2) {
            
            while (count < 12) {
                count++;
                total = number*count;
                System.out.println(number + " * " + count + " = " + total);
            }
            
        } else System.out.println("invalid");

       
    }
}
