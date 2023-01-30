import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int wholeNum;
        double decNum;

        System.out.println("hey whats your name?");
        name = input.next();
        System.out.println("hey, "+ name + " give me a whole number");
        wholeNum = input.nextInt();
        System.out.println("cool, "+ wholeNum+" a great whole number "+ name +" now give me a decimal number!");
        decNum = input.nextDouble();
        System.out.println("Awesome! " + name + " your numbers are " + wholeNum + 
        " (a great number) and " + decNum + " (a not so great number)");
        input.close();
    }
}
