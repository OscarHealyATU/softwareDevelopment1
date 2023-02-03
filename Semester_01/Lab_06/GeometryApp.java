package Semester_01.Lab_06;
import java.util.Scanner;

public class GeometryApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double circArea;
        int length,
            width,
            area, 
            height,
            radius; 
            
        //headings
        System.out.println("Welcome to Geometry App!");
        System.out.println("**Shapes**");
        System.out.println("Use this app to calculate the area of Rectangles, Circles, Triangles, and Squares.");
        
        //calculations - rectangle
        System.out.print("\nEnter the length of the rectangle: ");
        length = input.nextInt();
        System.out.print("Enter the width of the rectangle: ");
        width = input.nextInt();
        area = length*width;
        System.out.println("Area of the rectangle: " + area);

        // circle
        System.out.print("enter the radius of the circle: ");
        radius = input.nextInt();     
        circArea = Math.PI*radius*radius;
        System.out.println("Area of circle is: " + circArea);

        //square
        System.out.print("\nEnter the length and width of the square: ");
        length = input.nextInt();
        area = length*length;
        System.out.println("Area of a square: " + area);

        //triangle
        System.out.print("enter length for base: ");
        length = input.nextInt();
        System.out.print("enter height: ");
        height = input.nextInt();
        input.close();
        area = length*height/2;
        System.out.println("Area of triangle: " + area);
    }
}
