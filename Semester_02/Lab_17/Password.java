package Semester_02.Lab_17;
import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password = "mypass", guess;
        
        do {
            System.out.print("Enter password: ");
             guess = input.nextLine();    
        } while (!guess.equals(password));
        input.close();
        System.out.println("Access granted!");
    }
}
