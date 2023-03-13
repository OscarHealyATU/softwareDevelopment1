public class Sample5 {
    public static void main(String[] args) {
        
        int row = 0, column = 4;

        for (int i = 4; i > row; i--) {
            for (int j = 1; j <= column; j++) {
                if (j < i) {
                    System.out.print("\t");
                }
                else {
                    System.out.print(j + "\t");
                }
            }
            System.out.print("\n");
        }
    }
}
