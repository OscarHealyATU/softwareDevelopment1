package Lab_14;
import java.util.Scanner;

public class FifthLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a counter value: ");
        int count =1,
            value = input.nextInt();
        input.close();
        while (count <= value) {
            System.out.println("looper counter: " + count);
            count++;
        }
        

    }
}
