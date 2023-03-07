package Lab_019;

import java.util.Scanner;

public class AddWhat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = input.nextInt();
        input.close();
       if (number > 10 && number < 20) {
            number+= 100;
       } else if (number > 40 && number < 50) {
            number+=400;
       } else {
            number+= 10;
       }
       System.out.println("updated number: " + number);
    }    
}