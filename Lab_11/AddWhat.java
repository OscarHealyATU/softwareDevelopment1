import java.util.Scanner;

/**
 * AddWhat
 */
public class AddWhat {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = input.nextInt();
        input.close();
        System.out.println("");

        if (num > 100) {
            System.out.print(num + " + 10 = ");
            num = num + 10;
        } else if(num >= 50 && num <= 100) {
            System.out.print(num + " + 20 = ");
            num = num + 20;
        } else {
            System.out.print(num + " + 30 = ");
            num = num + 30;
        }
        
        System.out.println(num);
    }
}