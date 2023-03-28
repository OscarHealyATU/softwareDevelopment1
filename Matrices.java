import java.util.Scanner;

public class Matrices {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Matrices calc = new Matrices();     

        System.out.print("Enter Matrix height: ");
        int height = input.nextInt();
        System.out.print("Enter Matrix width: ");
        int width = input.nextInt(); 

        int[][] matrix = calc.createArray(width,height);
        int[][] matrixResult = matrix;

         // matrix output
         calc.PrintArray(matrix);
        System.out.println("1. addition\n2. subtraction\n3. mulitplication\n"
                        +"4. determinant\n5. transpose\n6. inverse\n");
        System.out.print("Select an option: ");
        int selection = input.nextInt();
        switch (selection) {
            case 1:
            matrixResult = calc.addMatrix(matrix);
            calc.PrintArray(matrixResult);
                break;
            case 2:
            matrixResult = calc.subMatrix(matrix);
            calc.PrintArray(matrixResult);
                break;
            case 3:
            matrixResult = calc.subMatrix(matrix);
                break;
            case 4:
            matrixResult = calc.subMatrix(matrix);
                break;
            case 5:
            matrixResult = calc.subMatrix(matrix);
                break;
            case 6:
            matrixResult = calc.subMatrix(matrix);
                break;
        
            default:
            System.out.println("invalid choice");
                break;
        }
        // addition adds 2 matrices of the same size
        //matrixResult = calc.createArray();
        // solve
        // determinant
        // inverse
        // transpose
        
        // subtraction
        // multiply
        input.close();
    }

    // populating matrix
    int[][] createArray(int width, int height){
        Scanner input = new Scanner(System.in);

        int[][] matrix = new int[height][width];
        System.out.println("\nEnter a value for:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
            System.out.print("row " + (i+1) + ", column" + (j+1) + ": ");
             matrix[i][j] = input.nextInt();       
            }
            System.out.println();
        }
        
        return matrix;
    }
    // adds one matrix to another
    int[][] addMatrix(int[][]matrix){
        int[][] secondMatrix = createArray(matrix.length, matrix[0].length);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] += secondMatrix[i][j];
            }
        }
        return matrix;
    }
    // subtracts one matrix from another
    int[][] subMatrix(int[][]matrix){
        int[][] secondMatrix = createArray(matrix.length, matrix[0].length);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] -= secondMatrix[i][j];
            }
        }
        return matrix;
    }
    // multiplies one matrix by another
    int[][] multMatrix(int[][]matrix){
        return matrix;
    }

    // takes in matrix array and prints an output
    void PrintArray(int[][]matrix){
        System.out.println(" Output:\n-----------\n");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("[" + matrix[i][j] + "] ");
            }
            System.out.println();
        }
    }
}