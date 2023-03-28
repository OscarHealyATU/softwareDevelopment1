package Lab_22;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Reverse r = new Reverse();

    System.out.print("Enter a number to be reversed: ");
    int number = /*input.nextInt();*/ 1234;
    int result = r.reverse(number);
    System.out.println("reversed number is " + result);

    //int result = r.reverse(input.nextInt());
    //System.out.println("reversed number is " + result);
    //System.out.println("reversed number is " + r.reverse(input.nextInt()));
        
    }
    int reverse(int x){
        int magnitude = 1, count = 0;
        while (magnitude < x) {
            count++;
            magnitude*=10;
        }  
        int[] number = new int[count];     
        for (int i = 0; i < count; i++) {
            
        }
        return x;
    }
}
