package Lab_13;
import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fifty,twenty,ten, five;
        double total;

        System.out.println("enter no. of 50c coins");
        fifty = input.nextInt() * 50;
        System.out.println("enter no. of 20c coins");
        twenty = input.nextInt() * 20;
        System.out.println("enter no. of 10c coins");
        ten = input.nextInt() * 10;
        System.out.println("enter no. of 5c coins");
        five = input.nextInt() * 5;
        input.close();
        
        total =  (fifty + twenty + ten + five)/100;
        System.out.println("Total amount of money: €"+ String.format("%.2f", total));
    }
}
