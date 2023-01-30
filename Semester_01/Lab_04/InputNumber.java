import java.util.*;
public class InputNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num;

        System.out.println("Enter a Number; ");
        num = input.nextInt();
        System.out.println("your number is " + num);

        input.close();
    }
    
}
