import java.util.Scanner;

public class LineNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lineNo;
        String sentence;
        System.out.println("enter a line number");
        lineNo = input.nextInt();
        input.nextLine(); // next int doesnt push it to the next line so we call this
        System.out.println("now enter a sentence");
        sentence = input.nextLine();
        System.out.print(lineNo + sentence);
        input.close();
        

    }
}
