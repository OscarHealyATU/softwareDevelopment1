package Lab_13;
import java.util.Scanner;

public class Fullname1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first name");
        String fname = input.next();
        System.out.println("Enter surname");
        String sName = " " + input.next();      
        System.out.println(fname.concat(sName));
        input.close();
    }
}
