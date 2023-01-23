import java.util.Scanner;

/**
 * Compound
 */
public class Compound {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int number = input.nextInt();
        number += 2;
        System.out.println("NUMBER UPDATED");
        System.out.println(number);
        number-=5;
        System.out.println("NUMBER UPDATED");
        System.out.println(number);
        input.close();
    }
}