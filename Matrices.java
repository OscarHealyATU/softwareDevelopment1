import java.text.DecimalFormat;
import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Matrices calc = new Matrices();
        String loopAgain = "y";
        while (loopAgain.equals("Y") || loopAgain.equals("y")) {

            System.out.print("\nMatrix Calculator \n-------------\nDefine it's size: \nEnter number of rows:  ");
            int row = input.nextInt();
            System.out.print("Enter number of columns: ");
            int column = input.nextInt();
            int selection, determinant = 0;
            int[][] matrix = calc.createArray(row, column);

            calc.printArray(matrix); // matrix output
            System.out.println("1. Addition\n"
                    + "2. Subtraction\n"
                    + "3. Mulitplication\n"
                    + "4. Transpose");
            if (row == column) {
                System.out.print(
                        "5. Determinant\n"
                                + "6. Inverse\n");
            }
            System.out.print("\n0. Quit\nSelect an option: ");
            selection = input.nextInt();

            switch (selection) {
                case 0: // quit
                    System.out.println("Goodbye.");
                    break;
                case 1: // Addition
                    calc.printArray(calc.addMatrix(matrix));
                    break;
                case 2: // subtraction
                    calc.printArray(calc.subMatrix(matrix));
                    break;
                case 3: // multiplication
                    calc.printArray(calc.multMatrix(matrix));
                    break;
                case 4: // transpose
                    calc.printArray(calc.transpose(matrix));
                    break;
                case 5: // determinant
                    System.out.println("Determinant is: " + calc.determinant(matrix));
                    break;
                case 6: // inverse
                    determinant = calc.determinant(matrix);
                    if (determinant != 0) {
                        System.out.println("\nDeterminant is: " + determinant + "\n");
                        if (matrix.length == 3) {
                            System.out.println("\nCofactor");
                            calc.printArray(calc.cofactor(matrix));
                        }
                        System.out.println("Transpose");
                        calc.printArray(calc.transpose(matrix));
                        System.out.println("Adjoint");
                        calc.printArray(calc.adjoint(matrix));
                        System.out.println("Inverse");
                        calc.printArray(calc.inverse(matrix));
                    } else
                        System.out.println("Matrix not invertable");
                    break;
                default:
                    System.out.println("Not a valid option");
                    break;
            }
            System.out.print("would you like to try another matrix? (enter Y or N): ");
            input.next();

        }
        input.close();
    }

    int[][] addMatrix(int[][] matrix) { // adds one matrix to another
        int[][] secondMatrix = createArray(matrix.length, matrix[0].length);
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                matrix[i][j] += secondMatrix[i][j];
        return matrix;
    }

    int[][] subMatrix(int[][] matrix) { // subtracts one matrix from another
        int[][] secondMatrix = createArray(matrix.length, matrix[0].length);
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                matrix[i][j] -= secondMatrix[i][j];
        return matrix;
    }

    int[][] multMatrix(int[][] matrix) { // multiplies one matrix by another
        Matrices calc = new Matrices();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of columns: ");
        int row1 = matrix.length,
                row2 = matrix[0].length,
                row3 = row1;
        int col1 = row2,
                col2 = input.nextInt(),
                col3 = col2;

        int[][] newMatrix = createArray(row2, col2);
        int[][] ansMatrix = new int[row3][col3];
        int[] list = new int[col3 * row3];

        calc.printArray(newMatrix);
        newMatrix = calc.transpose(newMatrix);
        // transposed second matrix to make this mess of a loop easier for me
        for (int x = 0; x < row3; x++) { // loop 3 moves to the next row
            for (int i = 0; i < ansMatrix[x].length; i++) { // loop 2 moves to the next column
                for (int j = 0; j < col3; j++) { // loop 1 calculates the value at its position,
                    list[i] += matrix[x][j] * newMatrix[i][j];
                }
                ansMatrix[x][i] = list[i];
                list[i] = 0;
            }
        }
        // loop 2 moves to the next column, and loop 3 moves to the next row
        return ansMatrix;
    }

    int determinant(int[][] matrix) { // calculates determinant
        int determinant;
        // calculates 2x2 determinant |A| = (a*d)-(b*c)
        if (matrix.length == 2)
            return (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
        else {

            int tl = matrix[0][0] * ((matrix[1][1] * matrix[2][2]) - (matrix[2][1] * matrix[1][2]));
            int tm = matrix[0][1] * ((matrix[1][0] * matrix[2][2]) - (matrix[2][0] * matrix[1][2]));
            int tr = matrix[0][2] * ((matrix[1][0] * matrix[2][1]) - (matrix[2][0] * matrix[1][1]));
            determinant = tl - tm + tr;
        }
        return determinant;
    }

    int[][] cofactor(int[][] matrix) { // calculates cofactor

        int tl = (matrix[1][1] * matrix[2][2]) - (matrix[2][1] * matrix[1][2]);
        int tm = -(matrix[1][0] * matrix[2][2]) + (matrix[2][0] * matrix[1][2]);
        int tr = (matrix[1][0] * matrix[2][1]) - (matrix[2][0] * matrix[1][1]);

        int ml = -(matrix[0][1] * matrix[2][2]) + (matrix[2][1] * matrix[0][2]);
        int mm = (matrix[0][0] * matrix[2][2]) - (matrix[2][0] * matrix[0][2]);
        int mr = -(matrix[0][0] * matrix[2][1]) + (matrix[2][0] * matrix[0][1]);

        int bl = (matrix[0][1] * matrix[1][2]) - (matrix[1][1] * matrix[0][2]);
        int bm = -(matrix[0][0] * matrix[1][2]) + (matrix[1][0] * matrix[0][2]);
        int br = (matrix[0][0] * matrix[1][1]) - (matrix[1][0] * matrix[0][1]);

        int[][] cofactor = { { tl, tm, tr }, { ml, mm, mr }, { bl, bm, br } };

        return cofactor;
    }

    int[][] transpose(int[][] matrix) { // calculates transpose
        int[][] newMatrix = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < newMatrix[0].length; i++)
            for (int j = 0; j < newMatrix.length; j++)
                newMatrix[j][i] = matrix[i][j];

        return newMatrix;
    }

    int[][] adjoint(int[][] matrix) { // calculates adjoint
        Matrices calc = new Matrices();
        if (matrix.length == 2) {
            int temp = matrix[0][0];
            matrix[0][0] = matrix[1][1];
            matrix[1][1] = temp;
            matrix[0][1] *= -1;
            matrix[1][0] *= -1;

        } else {
            matrix = calc.cofactor(matrix);
            matrix = calc.transpose(matrix);
        }
        return matrix;
    }

    // calculates inverse of a matrix A^(-1) = 1/|A| Adj(A)
    double[][] inverse(int[][] matrix) {
        Matrices calc = new Matrices();
        double[][] invMatrix = new double[matrix.length][matrix[0].length];
        double det = calc.determinant(matrix);
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix.length; j++) {
                invMatrix[i][j] = matrix[i][j] * (1 / det);
            }

        return invMatrix;
    }

    // takes in matrix array and prints an output
    void printArray(int[][] matrix) {
        System.out.println("-----------");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)
                System.out.print("[" + matrix[i][j] + "] ");
            System.out.println();
        }
        System.out.println();
    }

    void printArray(double[][] matrix) {
        DecimalFormat clean = new DecimalFormat("#.####");
        System.out.println("-----------");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)
                System.out.print("[" + clean.format(matrix[i][j]) + "] ");
            System.out.println();
        }
        System.out.println("*to 4 decimal places");
    }

    // populating matrix
    int[][] createArray(int height, int width) {
        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[height][width];
        System.out.println("\nEnter a value for:");

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("row " + (i + 1) + ", column" + (j + 1) + ": ");
                matrix[i][j] = input.nextInt();
            }
            System.out.println();
        }
        return matrix;
    }
}