import java.util.Scanner;

/**
 * NameAge
 */
public class NameAge {


    public static void main(String[] args) {
        int age, ageUp;
        String name;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first name: ");
        name = input.next();

        System.out.print("Enter your age: ");
        age = input.nextInt();
        ageUp = age + 20;
        System.out.println("\n\n" + name + " you are " + age + " in 20 years you will be " + ageUp);
        input.close();
    }
}