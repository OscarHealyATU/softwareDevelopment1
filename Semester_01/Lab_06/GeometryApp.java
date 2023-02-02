import java.util.Scanner;

public class GeometryApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length, area, perim,height;
        System.out.print("enter  single digit for length and width: ");
        length = input.nextInt();
        area = length*length;
        perim = length*4;
        System.out.println("Area of square: " + area);
        System.out.println("Perimeter of square is: " + perim);
        System.out.print("enter  single digit for length and width: ");
        int radius = input.nextInt();     
        int circDouble = (int) (Math.PI*20*radius);
        double circ = (double)circDouble/10;
        int diameter = radius*2;
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
