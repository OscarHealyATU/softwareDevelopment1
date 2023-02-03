package Semester_01.Lab_06;
import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter  single digit for length and width: ");
        int radius = input.nextInt();
        input.close();
        
        int circDouble = (int) (Math.PI*20*radius);
        double circ = (double)circDouble/10;
        int diameter = radius*2;

        System.out.println("Diameter of circle: " + diameter);
        System.out.println("circumference of circle is: " + circ);
    }
}
