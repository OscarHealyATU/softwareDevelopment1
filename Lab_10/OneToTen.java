package Lab_10;
import java.util.*;
/**
 * OneToTen
 */
public class OneToTen {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number between 1 and 10");
        int number = input.nextInt();

        if (number >= 1 || number <= 10) {
            System.out.println(number + " is valid");
        }else{
        System.out.println(number + " is not valid");
        }
        input.close();
    }
}