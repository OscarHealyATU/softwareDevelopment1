import java.util.Scanner;

public class multMatrix {
    public static void main(String[] args) {

        int[][] matrix = {{2,3,1},{2,-7,4}};
        int[][] newMatrix = {{3,4,5},{1,1,4},{2,1,4}};
        int[][] ansMatrix = new int[3][2];
    
        ansMatrix[0][0] = (matrix[0][0]*newMatrix[0][0])
                        + (matrix[0][1]*newMatrix[1][0])
                        + (matrix[0][2]*newMatrix[2][0]); 
       System.out.println("ansMatrix[0][0] = " + ansMatrix[0][0]);

       for (int i = 0; i < ansMatrix.length; i++) {
            ansMatrix[i][0] = (matrix[0][0]*newMatrix[0][i])
                            + (matrix[0][1]*newMatrix[1][i])
                            + (matrix[0][2]*newMatrix[2][i]); 
        }
        for (int i = 0; i < ansMatrix[i].length; i++) {
            ansMatrix[i][0] = (matrix[i][0]*newMatrix[0][0])
                            + (matrix[i][1]*newMatrix[1][0])
                            + (matrix[i][2]*newMatrix[2][0]); 
        }
        PrintArray(ansMatrix);   
    }
       
       
    
     // takes in matrix array and prints an output
     static void PrintArray(int[][]matrix){
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
