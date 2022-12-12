package Lab_10;
import java.util.*
;/**
 * OneOrTwo
 */
public class OneOrTwo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number that is either 1 or 2");
        int number = input.nextInt();

        if (number == 1 || number == 2) {
            System.out.println(number + " is valid");
        }else{
        System.out.println(number + " is not valid");
        }
        input.close();
    }
}