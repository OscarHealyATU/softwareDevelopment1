import java.util.Scanner;

public class Sample2 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter any number apart from ten: ");
    int not10 = input.nextInt();
        if (not10 != 10) {
            System.out.println("congrats!. number is not ten");
        } else {
            System.out.println("you are not allowed to enter the number 10");
        }
    input.close();        
    }
}
