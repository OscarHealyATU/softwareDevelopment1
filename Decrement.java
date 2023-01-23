import java.util.Scanner;

public class Decrement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        
        System.out.println("Number before post decrement " + x);
        System.out.println("Post decrement number " + x--);
        System.out.println("Number after post decrement " + x);
        System.out.println("");
        System.out.println("Number before pre decrement " + x);
        System.out.println("Pre decrement number " + --x);
        System.out.println("Number after pre decrement " + x);

        input.close();
    }
}
