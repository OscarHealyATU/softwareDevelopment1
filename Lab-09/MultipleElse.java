import java.util.Scanner;

public class MultipleElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.println("Enter first number");
        num1 = input.nextInt();
        System.out.println("Enter second number");
        num2 = input.nextInt();

        if (num1 % num2 == 0) {
            System.out.println(num1 + " is a multiple of " + num2);

        }else if(num2 % num1 == 0){
            System.out.println(num2 + " is a multiple of " + num1);
        }else {
            System.out.println("Not a multiple");
        }
        input.close();
    }
}
