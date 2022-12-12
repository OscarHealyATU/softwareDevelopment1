import java.util.Scanner;

public class Vote {
    public static int AOC = 18;
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("enter your age");
        int age = input.nextInt();
        input.close();
        if (age < AOC) {
            System.out.println("not eligible to vote");
        } else {
            System.out.println("eligible to vote");
        }


    }
}
