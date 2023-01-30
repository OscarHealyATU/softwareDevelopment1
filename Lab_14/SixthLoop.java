package Lab_14;
import java.util.Scanner;

public class SixthLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nplease enter a loop counter value: ");
        int value = input.nextInt();
        input.close();

        System.out.println("before loop");
            while (value < 5) {
                value++;
                System.out.println("inside loop- Counter = " + value);    
            }
            System.out.println("after loop");
    }
}
