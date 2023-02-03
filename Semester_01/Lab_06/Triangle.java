package Semester_01.Lab_06;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter length for base: ");
        int length = input.nextInt();
        System.out.print("enter height: ");
        int height = input.nextInt();
        input.close();
        int area = length*height/2;
        
        System.out.println("Area of triangle: " + area);
        
    }
}
