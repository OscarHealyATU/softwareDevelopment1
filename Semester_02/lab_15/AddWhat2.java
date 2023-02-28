import java.util.Scanner;

public class AddWhat2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("enter a number: ");
        int number = input.nextInt();
        input.close();

        if (number > 100) {
            number*=10;
        }else if (number > 75 && number <= 100) {
            number*=8;
        }else if (number > 50 && number <= 75) {
            number*=6;
        }else if (number > 25 && number <= 50) {
            number*=4;
        }else {
            number*=2;
        }
        System.out.println("Updated number = " + number);
    
    }
}
