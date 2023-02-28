package Semester_02.Lab_16;
import java.util.Scanner;

public class SumFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter num ");
        String fullNum = input.next();
        input.close();
        
        String output = "";
        int total = 0;
        
        for (int i = 0; i < fullNum.length(); i++) {
        char digitChr = fullNum.charAt(i);

        if (i < fullNum.length()-1) {
            output += digitChr + " + ";
        } else {
            output += digitChr + " = ";
        }
        
        // copied |Integer.parseInt| from internet
         total += Integer.parseInt(String.valueOf(digitChr));                  
        }

        System.out.println(output + total);
    }
}
