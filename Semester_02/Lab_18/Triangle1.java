package Lab_18;
import java.util.Scanner;
public class Triangle1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String triangle = "";
        //height
        System.out.print("Enter height: ");
        int height = input.nextInt();
        input.close();
        
        for (int row = 0; row <= height; row++) {
            for (int column = 0; column < row; column++) {
                triangle+="+"; // prints x number of pluses based on the row number
            }   
            triangle+="\n";
        }
        System.out.println(triangle);
    }
}
