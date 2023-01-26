import java.util.Scanner;

public class Last {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String value;
        System.out.println("Enter a string value");
        value = input.nextLine();
        input.close();

        System.out.println("Last value in string is: " + value.charAt(value.length()-1));;

    }
}
