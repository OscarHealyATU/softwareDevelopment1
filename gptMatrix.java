import java.util.Scanner;

public class gptMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] matrix = new double[3][3];

        // Read in the matrix from the user
        System.out.println("Enter the 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        // Calculate the determinant
        double determinant = matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[2][1] * matrix[1][2])
                - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
                + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);

        // Check if the determinant is zero
        if (determinant == 0) {
            System.out.println("The matrix is not invertible.");
            return;
        }

        // Calculate the inverse
        double[][] inverse = new double[3][3];
        inverse[0][0] = (matrix[1][1] * matrix[2][2] - matrix[2][1] * matrix[1][2]) / determinant;
        inverse[0][1] = (matrix[0][2] * matrix[2][1] - matrix[0][1] * matrix[2][2]) / determinant;
        inverse[0][2] = (matrix[0][1] * matrix[1][2] - matrix[0][2] * matrix[1][1]) / determinant;
        inverse[1][0] = (matrix[1][2] * matrix[2][0] - matrix[1][0] * matrix[2][2]) / determinant;
        inverse[1][1] = (matrix[0][0] * matrix[2][2] - matrix[0][2] * matrix[2][0]) / determinant;
        inverse[1][2] = (matrix[1][0] * matrix[0][2] - matrix[0][0] * matrix[1][2]) / determinant;
        inverse[2][0] = (matrix[1][0] * matrix[2][1] - matrix[2][0] * matrix[1][1]) / determinant;
        inverse[2][1] = (matrix[2][0] * matrix[0][1] - matrix[0][0] * matrix[2][1]) / determinant;
        inverse[2][2] = (matrix[0][0] * matrix[1][1] - matrix[1][0] * matrix[0][1]) / determinant;

        // Print out the inverse
        System.out.println("The inverse of the matrix is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(inverse[i][j] + " ");
            }
            System.out.println();
        }
    }
}
