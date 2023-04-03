import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Matrices calc = new Matrices();    

        System.out.print("\nMatrix Calculator \nEnter Matrix width: ");
        int width = input.nextInt();
        System.out.print("Enter Matrix height: ");
        int height = input.nextInt();
        int[][] matrix = calc.createArray(width,height);
        int selection, 
            determinant = 0;
        
        calc.printArray(matrix); // matrix output

        System.out.println("1. Addition\n"
                        +"2. Subtraction\n"
                        +"3. Mulitplication\n"
                        +"4. Transpose");
        if(width == height) {
            System.out.print(
                         "5. Determinant\n"
                        +"6. Inverse\n");
        }
        System.out.println("\n0. Quit\nSelect an option: ");
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
                calc.printArray(calc.multMatrix(matrix, width));
                    break;
                case 4: // transpose
                calc.printArray(calc.transpose(matrix));
                    break;
                case 5: // determinant
                System.out.print("Determinant is: " + calc.determinant(matrix));
                    break;
                case 6: // inverse
                    determinant = calc.determinant(matrix);
                    System.out.println("determinant is " + determinant);
                    if (determinant != 0) {
                        System.out.println("determinant is " + determinant);
                        System.out.println("cofactor");
                        calc.printArray(calc.cofactor(matrix));
                        System.out.println("transpose");
                        calc.printArray(calc.transpose(matrix));
                        System.out.println("adjoint");
                        calc.printArray(calc.adjoint(matrix));
                        System.out.println("inverse");
                        calc.printArray(calc.inverse(matrix));
                    } else System.out.println("Matrix not invertable");
                    
                        break;            
                default:
                System.out.println("Not a valid option");
                    break;
            }
        input.close();
    }
   
    int[][] addMatrix(int[][]matrix){ // adds one matrix to another
        int[][] secondMatrix = createArray(matrix[0].length,matrix.length);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] += secondMatrix[i][j];
            }
        }
        return matrix;
    }

    int[][] subMatrix(int[][]matrix){ // subtracts one matrix from another
        int[][] secondMatrix = createArray(matrix[0].length,matrix.length);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] -= secondMatrix[i][j];
            }
        }
        return matrix;
    }

    int[][] multMatrix(int[][]matrix, int mHeight){ // multiplies one matrix by another
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a width ");
        int newWidth = input.nextInt();
        int[][] newMatrix = createArray(matrix[0].length,newWidth);
        int[][] ansMatrix = new int[2][3];

       for (int i = 0; i < ansMatrix.length; i++) {
           for (int j = 0; j < ansMatrix[i].length; j++) {
            ansMatrix[i][j] = (matrix[i][0]*newMatrix[0][j])
                            + (matrix[i][1]*newMatrix[1][j])
                            + (matrix[i][2]*newMatrix[2][j]); 
            }  
        }
        return ansMatrix;
    }
    int determinant(int[][]matrix){ // calculates determinant 
        int determinant = 0;
        if (matrix.length == 2) { // calculates 2x2 determinant |A| = (a*d)-(b*c)
            determinant = (matrix[0][0]*matrix[1][1])-(matrix[0][1]*matrix[1][0]);
            return determinant; 
        } else {
        int tl, tm, tr;

        tl = matrix[0][0] * ((matrix[1][1]*matrix[2][2])-(matrix[2][1]*matrix[1][2]));
        tm = matrix[0][1] * ((matrix[1][0]*matrix[2][2])-(matrix[2][0]*matrix[1][2]));
        tr = matrix[0][2] * ((matrix[1][0]*matrix[2][1])-(matrix[2][0]*matrix[1][1]));
        determinant = tl - tm + tr; 
    }
        return determinant;
     }

     int[][] cofactor(int[][] matrix){ // calculates cofactor
        int tl, tm, tr, ml, mm, mr, bl, bm, br;

        tl =  (matrix[1][1]*matrix[2][2])-(matrix[2][1]*matrix[1][2]);
        tm = -(matrix[1][0]*matrix[2][2])+(matrix[2][0]*matrix[1][2]);
        tr =  (matrix[1][0]*matrix[2][1])-(matrix[2][0]*matrix[1][1]);

        ml = -(matrix[0][1]*matrix[2][2])+(matrix[2][1]*matrix[0][2]);
        mm =  (matrix[0][0]*matrix[2][2])-(matrix[2][0]*matrix[0][2]);
        mr = -(matrix[0][0]*matrix[2][1])+(matrix[2][0]*matrix[0][1]);

        bl =  (matrix[0][1]*matrix[1][2])-(matrix[1][1]*matrix[0][2]);
        bm = -(matrix[0][0]*matrix[1][2])+(matrix[1][0]*matrix[0][2]);
        br =  (matrix[0][0]*matrix[1][1])-(matrix[1][0]*matrix[0][1]);

        int[][] cofactor = {{tl,tm,tr},{ml,mm,mr},{bl,bm,br}};
        
        return cofactor;
     }
     
    int[][] transpose(int[][] matrix){ // calculates transpose
        int[][] newMatrix = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < newMatrix[0].length; i++) {
           for (int j = 0; j < newMatrix.length; j++) {
            newMatrix[j][i] = matrix[i][j];
           }
        }
        return newMatrix;
    }

    int[][] adjoint(int[][]matrix){ // calculates adjoint
        Matrices calc = new Matrices();
        if (matrix.length == 2) {
                int temp = matrix[0][0];
            matrix[0][0] = matrix[1][1];
            matrix[1][1] = temp; 
            matrix[0][1] *=-1;
            matrix[1][0] *=-1;
        }else {
            matrix = calc.cofactor(matrix);
            matrix = calc.transpose(matrix);
        }
        return matrix;
     }
    // calculates inverse of a matrix A^(-1) = 1/|A| Adj(A)
    double[][] inverse(int[][]matrix){
        Matrices calc = new Matrices();
        double[][] invMatrix = new double[matrix.length][matrix[0].length];
        double det = calc.determinant(matrix); 
          matrix = calc.adjoint(matrix);
       
          if (det !=0) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    invMatrix[i][j] = matrix[i][j]*(1/det); 
                }
            } 
            System.out.println(det);
        } else System.out.println("Determinant is 0 - inverse method");
        return invMatrix;
     }
    // takes in matrix array and prints an output
    void printArray(int[][]matrix){
        System.out.println("-----------");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("[" + matrix[i][j] + "] ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    void printArray(double[][]matrix){
        System.out.println("-----------");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("[" + matrix[i][j] + "] ");
            }
            System.out.println();
        }
        System.out.println();
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
}