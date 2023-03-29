import java.util.Scanner;

public class multMatrix {
    public static void main(String[] args) {

        int[][] matrix = {{2,3,1},{2,-7,4}};
        int[][] newMatrix = {{3,4,5},{1,1,4},{2,1,4}};
        int[][] ansMatrix = new int[2][3];

       for (int i = 0; i < ansMatrix.length; i++) {
        
           for (int j = 0; j < ansMatrix[i].length; j++) {
            ansMatrix[i][j] = (matrix[i][0]*newMatrix[0][j])
                            + (matrix[i][1]*newMatrix[1][j])
                            + (matrix[i][2]*newMatrix[2][j]); 
        }
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
