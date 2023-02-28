public class SquaresArithmeticTable {
    public static void main(String[] args) {
        int count = 1;
        int countSquared;
        int output = 0;
        System.out.println("-------------");
        System.out.println("Number Square");
        System.out.println("-------------");
        while (count <= 10) {
            countSquared = (count * count);
            System.out.println(count + "\t" + countSquared);
            output += countSquared;
            count++;
            
        }
        System.out.println("-------------");
        System.out.println("Total\t" + output);
        System.out.println("-------------");
    }
}
