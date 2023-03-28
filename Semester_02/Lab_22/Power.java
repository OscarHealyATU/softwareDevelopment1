package Lab_22;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter number: ");
        int x = input.nextInt();
        System.out.print("enter power: ");
        int power = input.nextInt();
        input.close();
        
        System.out.println(powerOf(x, power));
    }

    static int powerOf(int x, int power){
        int value = x;
        for (int i = 1; i < power; i++) value *= x;
        return value;
    }
}
