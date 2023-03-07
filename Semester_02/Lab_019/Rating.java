package Lab_019;

import java.util.Scanner;

public class Rating {
    public static void main(String[] args) {
        String output1 = "You gave the book you just read a rating of ", 
               output2 = " which indicates you think the book is ";

        Scanner input = new Scanner(System.in);
        System.out.print("Enter rating for a book you just read (any value from 1 to 5): ");
        int rating = input.nextInt(); input.close();
        System.out.println();
        
        switch (rating) {
            case 1:
                System.out.println(output1 + rating + output2 + "poor");
                break;
            case 2:
                System.out.println(output1 + rating + output2 + "not great");
                break;
            case 3:
                System.out.println(output1 + rating + output2 + "ok");
                break;
            case 4:
                System.out.println(output1 + rating + output2 + "very good");
                break;
            case 5:
                System.out.println(output1 + rating + output2 + "excellent");
                break;
        
            default:
            System.out.println("Invalid rating");
                break;
        }

    }
}
