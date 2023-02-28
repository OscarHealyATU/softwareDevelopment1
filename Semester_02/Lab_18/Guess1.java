package Lab_18;

import java.util.Scanner;

public class Guess1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int guess, 
            ans = 5, 
            counter = 0;
        do {
            counter++;
        System.out.print("Guess the number: ");
        guess = input.nextInt();
        }while (guess != ans);
        input.close();
        System.out.println("Good guess. It is " + ans + ". It took you " + counter + " attempts to guess the number");
    }           
 }  

