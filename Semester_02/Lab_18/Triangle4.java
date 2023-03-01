package Semester_02.Lab_18;
import java.util.Scanner;

public class Triangle4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String triangle = "";
        //height
        System.out.print("Enter height: ");
        int height = input.nextInt();
        int count = 0;
        input.close();
        
        for (int row = height; row >= 0; row--) {
            count++;
            triangle+="\n"; // new row
            for (int column = 0; column < row; column++) {
                triangle+=" "; // prints x number of pluses based on the row number
            }  
            for (int column = 0; column < count; column++) {
                triangle+="+"; // prints x number of pluses based on the row number
            }              
        }
        System.out.println(triangle);
    }
}
