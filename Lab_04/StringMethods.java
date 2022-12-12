import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word;
        int lengthGuess;
        System.out.println("type a word in");
        word = input.next();
        lengthGuess = word.length();
        System.out.println("word length is " + lengthGuess);
        input.close();
    }
}
