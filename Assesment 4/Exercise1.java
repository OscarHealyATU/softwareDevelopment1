import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result, number1, number2, number3, number4;

        System.out.print("Enter first number: ");
         number1 = input.nextInt();
        System.out.print("Enter second number: ");
         number2 = input.nextInt();
        System.out.print("Enter third number: ");
         number3 = input.nextInt();
        System.out.print("Enter fourth number: ");
         number4 = input.nextInt();
         input.close();

         result = number1 * number4;

        System.out.println(number1 + " * " + number4 + " = " + result);

    }
}