package Lab_13;
import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int age;

        System.out.println("Enter your name.");
        name = input.next();

        System.out.println("Enter your age.");
        age = input.nextInt();
        input.close();
        System.out.print("\nHi " + name + ", ");
        if (age < 66) {
            if (age < 4) {
                System.out.print("you are a toddler. ");
            }
            if(age >= 3 && age <= 13){
                System.out.print("you are a child. ");
            }
            if (age > 12 && age < 20) {
                System.out.print("you are a teenager. ");
            }
            if (age >19 && age < 66) {
                System.out.print("you are an adult. ");
            }
         }else {
        System.out.print("you are a senior citezen ");
        }        
        System.out.println("");
    }
}
