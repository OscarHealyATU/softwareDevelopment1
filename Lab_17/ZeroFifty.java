import java.util.Scanner;

public class ZeroFifty {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
        do {
            System.out.print("Enter a number: "   );
            i = input.nextInt();
            
        } while (i <= 50 || i <= 0);
        input.close();
        System.out.println("Number entered which is not between 0 and 50. Program endes");
    }
}
