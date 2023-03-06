package Lab_019;

import java.util.Scanner;

public class NestedLoopThrees {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = 0;
        int ans = 0;
        do {
            
            System.out.print("You have " + (length+1) + " rows, need another? Enter 0 for no: ");
            ans = input.nextInt();
            length++;
        } while (ans != 0); input.close();

        String output = "";
        
        for (int i = 0; i < length; i++) { //rows
            for (int j = 0; j < 5; j++) { // columns
                output+="3";
                if (j != 4) {
                    output+=", ";
                }
            }
            output+="\n";
        }
        System.out.println(output);
    }
}
