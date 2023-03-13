import java.util.Scanner;

public class Sample3 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("enter a number:");
    int number = input.nextInt();
    input.close();

         if (number >=  5 && number <= 10 ) number += 10;        
    else if (number >= 15 && number <= 20 ) number += 20;
    else if (number >= 25 && number <= 30 ) number += 30;
    else if (number >= 35 && number <= 40 ) number += 40;
    else if (number >= 45 && number <= 50 ) number += 50;
    else number += 5;

    System.out.println(number);
    }
}
