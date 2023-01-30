import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String value for a.");
        String a = input.next();
        System.out.println("Enter String value for b.");
        String b = input.next();
        System.out.println("Strings before swap a = " + a + " and b = " + b);
        input.close();

        a+= b;
        b = a.substring(0,a.length()-b.length());
        a = a.substring(b.length(),a.length());
        System.out.println("Strings after swap a = " + a + " and b = " + b);
    }
}
