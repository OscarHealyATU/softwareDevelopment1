import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String word;
        char guess;
        int lengthGuess;

        System.out.println("type a word in");
        word = input.next();

        System.out.println("word length is " + word.length());

        System.out.println(word.charAt(0));
        System.out.println(word.charAt(word.length()-1));

        System.out.println(word.indexOf(word.charAt(1)));
        System.out.println("enter a letter in the word");
        input.next();
        
        
        
        
        input.close();
    }
}
