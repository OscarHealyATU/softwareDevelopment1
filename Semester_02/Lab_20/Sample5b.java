public class Sample5b {
    public static void main(String[] args) {
        
        int row = 4, column = 0;

        for (int i = 4; i > column; i--) {
            for (int j = 1; j <= row; j++) {
                if (j < i) System.out.print("\t");
                else System.out.print(j + "\t");
            }
            System.out.print("\n");
        }
    }
}

