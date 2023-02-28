package Lab_18;
import java.util.Scanner;

public class RectanglePattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //height
        System.out.print("Enter height: ");
        int height = input.nextInt();
        //width
        System.out.print("Enter width: ");
        int width = input.nextInt();
        input.close();
        
        for (int row = 0; row < height; row++) {
            for (int column = 0; column < width; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
