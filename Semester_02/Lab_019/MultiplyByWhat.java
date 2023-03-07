package Lab_019;

import java.util.Scanner;

public class MultiplyByWhat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt(); input.close();

        //if statement
        if (number>20 && number<30) { number*=3;} 
        else if (number>40 && number<50) {number*=5;} 
        else if (number>60 && number<70) {number*=7;} 
        else if (number>80 && number<90) {number*=9;}
        else {number*=10;}

        System.out.println("Number updated: " + number);
    }  
}