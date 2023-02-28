package Lab_14;
import java.util.Scanner;

public class LargeSmall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 1, 
            number = 0, 
            largest = 0,
            smallest = 0;

        while (count<=5) {
            System.out.print("Enter Number " + count + ": ");
            number = input.nextInt();

            if(largest <= number){
                largest = number;
            }
            if (smallest >= number || count == 1) {
                smallest=number;
            }

            count++;   
        }
        
        input.close();

        System.out.println("Smallest number is: " + smallest);
        System.out.println("Largest number is: " + largest);

    }
}
