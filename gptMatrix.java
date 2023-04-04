public class gptMatrix {

    public static void main(String[] args) {
        
        int[][] matrix1 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int[][] matrix2 = { {9, 8, 7}, {6, 5, 4}, {3, 2, 1} };
        
        int[][] result = multiplyMatrices(matrix1, matrix2);
        
        // print the resulting matrix
        for(int i=0; i<result.length; i++) {
            for(int j=0; j<result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        
        int rows1 = matrix1.length;
        int columns1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int columns2 = matrix2[0].length;
        
        // check if the matrices can be multiplied
        if(columns1 != rows2) {
            throw new IllegalArgumentException("Matrices cannot be multiplied");
        }
        
        // create a new matrix to store the result
        int[][] result = new int[rows1][columns2];
        
        // multiply the matrices
        for(int i=0; i<rows1; i++) {
            for(int j=0; j<columns2; j++) {
                for(int k=0; k<columns1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        
        return result;
    }
}
