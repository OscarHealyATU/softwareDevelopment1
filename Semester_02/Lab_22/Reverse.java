package Lab_22;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Reverse r = new Reverse();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to be reversed: ");
        System.out.println("reversed number is " + r.reverse(input.nextInt()));
        input.close();
    }
    int reverse(int x){
        int y, z =0, magnitude = 1, count = 0;

        while (magnitude < x) { count++; magnitude*=10; }
        magnitude/=10;  

        for (int i = 0; i < count; i++) {
            y = x % 10;
            z+=y*magnitude;
            magnitude/=10;
            x/=10;
        }      
        return z;
    }
}
