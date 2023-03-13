public class Sample5b {
    public static void main(String[] args) {       
        for (int i = 4; i > 0; i--) {
            for (int j = 1; j <= 4; j++) {
                if (j < i) System.out.print("\t");
                else System.out.print(j + "\t");
            }
            System.out.println();
        }
    }
}
