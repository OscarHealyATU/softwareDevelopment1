package Lab_14;
import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 1, number=0;
        while (count<=5) {
            System.out.print("Enter Number " + count + ": ");
            number += input.nextInt();
            count++;   
        }
        input.close();
        System.out.println("5 numbers added are: " + number);

    }
}
