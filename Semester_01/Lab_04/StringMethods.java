import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String word;
        String letter;
        String name;
        String sName;
        String val1;
        String val2;
        String fullString;
        String wordReplace;
         
        System.out.println("type a word in");
        word = input.next();

        System.out.println("word length is " + word.length());

        System.out.println(word.charAt(0));
        System.out.println(word.charAt(word.length()-1));

        System.out.println(word.indexOf(word.charAt(1)));
        System.out.println("enter a letter in the word");
        System.out.println("-1 indicates letter is not in the word");
        letter = input.next();
        
        System.out.println(word.indexOf(letter));
        
        System.out.println("type in a first name");
        name = input.next() + " ";
        System.out.println("type in a last name");
        sName = input.next();
        name = name.concat(sName);
        System.out.println(name);

        System.out.println("enter in a word");
        val1 = input.next();
        System.out.println("enter an identical word");
        val2 = input.next();
        System.out.println("case insensitive check: " + val1.equalsIgnoreCase(val2));
        System.out.println("case sensitive check: " + val1.equals(val2));

        System.out.println("enter word to be shortened");
        fullString = input.next();
        System.out.println(fullString.substring(0,3));

        System.out.println("enter a word with at least 1 'u' in it");
        wordReplace = input.next();
        System.out.println(wordReplace.replace("u", "x"));
        
        input.close();
    }
}
