import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1, sum = 1;
        
        while (i != -1) {
            System.out.print("enter a number (-1 to quit): ");
            i = input.nextInt();
            sum += i;
        }
        input.close();
        System.out.println("total: " + sum);


    }
}
