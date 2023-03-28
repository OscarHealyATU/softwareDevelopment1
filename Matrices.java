import java.util.Scanner;

public class Matrices {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Define size of matrix array
        System.out.print("Enter Matrix height: ");
        int height = input.nextInt();
        System.out.print("Enter Matrix width: ");
        int width = input.nextInt();       

        // solve
        // determinant
        // inverse
        // transpose
        // addition
        // subtraction
        // multiply

        // matrix arrays
        int[][] matrix = new int[height][width];
        int[][] matrixResult = new int[height][width];
        
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix.length; j++) {
            System.out.print("enter a value for row " + (i+1) + ", column" + (j+1) + ": ");
             matrix[i][j] = input.nextInt();       
            }
        }
        // matrix output
        System.out.println("\n\tOutput:\t.\n-----------");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print("[" + matrix[i][j] + "] ");
            }
            System.out.println();
        }
    }
}