import java.util.Scanner;

public class AddWhat3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("enter a number: ");
        int number = input.nextInt();
        input.close();

        if (number > 100) {
            number+=10;
        }else if (number > 50 && number <= 100) {
            number+=5;
        }else if (number > 20 && number <= 50) {
            number+=2;
        }else {
            number+=1;
        }
        System.out.println("Updated number = " + number);
    
    }
}
