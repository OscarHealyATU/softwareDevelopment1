
public class SquaresArithmetic {

    public static void main(String[] args) {
        int count = 1;
        int countSquared;
        int output = 0;
        while (count <= 10) {
            countSquared = (count * count);
            output += countSquared;
            count++;
        }
        System.out.println(output);
    }
}