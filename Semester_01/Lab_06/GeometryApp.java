import java.util.Scanner;

public class GeometryApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length, area, perim,height,radius,circDouble, diameter;
        double circ;

        System.out.println("Welcome to Geometry App!");
        System.out.println("Use this app to calculate the area of Rectangles, Circles, Triangles, and Squares.");
        System.out.print("enter the length of the rectangle: ");
    
        length = input.nextInt();
        area = length*length;
        perim = length*4;
        System.out.println("Area of square: " + area);
        System.out.println("Perimeter of square is: " + perim);
        System.out.print("enter  single digit for length and width: ");
        radius = input.nextInt();     
        circDouble = (int) (Math.PI*20*radius);
        circ = (double)circDouble/10;
        diameter = radius*2;
        System.out.println("Diameter of circle: " + diameter);
        System.out.println("circumference of circle is: " + circ);
        System.out.print("enter length for base: ");
        length = input.nextInt();
        System.out.print("enter height: ");
        height = input.nextInt();
        input.close();
        area = length*height/2;
        System.out.println("Area of triangle: " + area);
    }
}
