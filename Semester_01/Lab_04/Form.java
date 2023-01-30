import java.util.Scanner;
public class Form {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name;
        String phone;
        String email;

        System.out.print("\nYour Name: ");
        name = input.nextLine();
        System.out.print("\nYour Phone: ");
        phone = input.next();
        System.out.print("\nYour Email: ");
        email = input.next();

        System.out.println("");
        System.out.println("-===============================-");
        System.out.println("-\t\tGMIT\t\t-");
        System.out.println("-===============================-");
        System.out.println("- Name: \t- " + name + "\t-");
        System.out.println("---------------------------------");
        System.out.println("- Phone: \t- (" + phone.substring(0,3) + ") " 
        + phone.substring(3,phone.length()-1) + "\t-");
        System.out.println("---------------------------------");
        System.out.println("- Email: \t- " + email + "\t-");
        System.out.println("---------------------------------");

        input.close();
    }
}
