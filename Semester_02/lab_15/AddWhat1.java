import java.util.Scanner;

public class AddWhat1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("enter a number: ");
        int number = input.nextInt();
        input.close();

        if (number > 20) {
            number+=2;
        }else if (number > 10 && number <= 20) {
            number+=3;
        }else {
            number+=1;
        }
        System.out.println("Updated number = " + number);
    }
    
}