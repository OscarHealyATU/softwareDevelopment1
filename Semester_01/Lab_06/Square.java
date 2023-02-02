import java.util.Scanner;

/**
 * Square
 */
public class Square {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter  single digit for length and width: ");
        int length = input.nextInt();
        input.close();
        int area = length*length;
        int perim = length*4;
        System.out.println("Area of square: " + area);
        System.out.println("Perimeter of square is: " + perim);

        
    }
}