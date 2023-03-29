import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Matrices calc = new Matrices();     

        System.out.print("Enter Matrix width: ");
        int width = input.nextInt();
        System.out.print("Enter Matrix height: ");
        int height = input.nextInt();
        int[][] matrix = calc.createArray(width,height);
        int  determinant = 0;
        
        // matrix output
        calc.PrintArray(matrix);
        System.out.println("1. addition\n"
                        +"2. subtraction\n"
                        +"3. mulitplication\n"
                        +"4. determinant\n"
                        +"5. transpose\n"
                        +"6. inverse\n");
        System.out.print("Select an option: ");
        int selection = input.nextInt();

        switch (selection) {
            case 1: // Addition
            calc.PrintArray(calc.addMatrix(matrix));
                break;
            case 2: // subtraction
            calc.PrintArray(calc.subMatrix(matrix));
                break;
            case 3: // multiplication
            calc.PrintArray(calc.multMatrix(matrix, width));
                break;
            case 4: // determinant
            if (matrix.length > 2)  determinant = calc.determinant3(matrix);
            else determinant = calc.determinant2(matrix);
            System.out.print("Determinant is: " + determinant);
                break;
            case 5: // inverse
            matrix = calc.subMatrix(matrix);
                break;
            case 6: // transpose
            matrix = calc.subMatrix(matrix);
                break;
        
            default:
            System.out.println("invalid choice");
                break;
        }
        // inverse
        // transpose
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
    int[][] multMatrix(int[][]matrix, int mHeight){
       return matrix;
       
    }

    // calculates 2x2 determinant |A| = (a*d)-(b*c)
    int determinant2(int[][]matrix){
        int determinant = (matrix[0][0]*matrix[1][1]) - (matrix[0][1]*matrix[1][0]);
        return determinant;
     }

    // calculates 3x3 determinant 
    int determinant3(int[][]matrix){
        int tl, tm, tr,det = 0;/*int ml, mm, mr, bl, bm, br;*/

        tl = matrix[0][0] * ((matrix[1][1]*matrix[2][2])-(matrix[2][1]*matrix[1][2]));
        tm = matrix[0][1] * ((matrix[1][0]*matrix[2][2])-(matrix[2][0]*matrix[1][2]));
        tr = matrix[0][2] * ((matrix[1][0]*matrix[2][1])-(matrix[2][0]*matrix[1][1]));

    /*  ml = matrix[1][0] * ((matrix[0][1]*matrix[2][2])-(matrix[2][1]*matrix[0][2]));
        mm = matrix[1][1] * ((matrix[0][0]*matrix[2][2])-(matrix[2][0]*matrix[0][2]));
        mr = matrix[1][2] * ((matrix[0][0]*matrix[2][1])-(matrix[2][0]*matrix[0][1]));

        bl = matrix[2][0] * ((matrix[0][1]*matrix[1][2])-(matrix[1][1]*matrix[0][2]));
        bm = matrix[2][1] * ((matrix[0][0]*matrix[1][2])-(matrix[1][0]*matrix[0][2]));
        br = matrix[2][2] * ((matrix[0][0]*matrix[1][1])-(matrix[1][0]*matrix[0][1]));
        */
        det = tl - tm + tr; 
        return det;
     }

    // takes in matrix array and prints an output
    void PrintArray(int[][]matrix){
        System.out.println(" Output:\n-----------");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("[" + matrix[i][j] + "] ");
            }
            System.out.println();
        }
        System.out.println();
    }
}