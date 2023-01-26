import java.util.Scanner;

public class Match {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String value1, value2;

        System.out.println("Enter in a word or sentence.");
        value1 = input.nextLine();
        System.out.println("Repeat word or sentence for verification");
        value2 = input.nextLine();

        input.close();

        if (value1.equals(value2)) {
         System.out.println("Input matches");   
        } else {
            System.out.println("Input doesnt match");   
        }


        
    }
}
