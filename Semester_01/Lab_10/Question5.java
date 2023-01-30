package Semester_01.Lab_10;
import java.util.*;
/**
 * Question5
 */
public class Question5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many choices are possible when  using a single if-else statement?");
        System.out.println("select one:\n\nA.|\t One\nB.|\t Two\nC.|\t Three\nD.|\t Four\n");
        
        String ans = input.next();

        switch (ans) {
            case "a":
                System.out.println("incorrect!");
                break;
            case "b":
                System.out.println("incorrect!");
                break;
            case "c":
                System.out.println("correct!");
                break;
            case "d":
                System.out.println("incorrect!");
                break;
        
            default:
                System.out.println("invalid answer");
                break;
        }
        input.close();
    }
}