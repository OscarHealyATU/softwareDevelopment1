import java.util.Scanner;

public class Sample1 {
    public static void main(String[] args) {
        int number1, number2, number3, result;
        Scanner input = new Scanner(System.in);
    
        System.out.print("Enter number 1: ");
        number1 = input.nextInt();
        System.out.print("Enter number 2: ");
        number2 = input.nextInt();
        System.out.print("Enter number 3: ");
        number3 = input.nextInt();
        input.close();        

        result = (number1*2) + (number2*4) + (number3*8);
        System.out.println("(" + number1 + " * 2) + (" + 
                            number2 + " * 4) + (" + 
                            number3 + " * 8) = " + result);
    }
}
