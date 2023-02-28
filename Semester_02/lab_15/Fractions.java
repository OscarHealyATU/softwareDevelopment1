public class Fractions {
    public static void main(String[] args) {
        double sum = 0, 
               term = 1.0;
        int count = 0;
        while (count < 10) {
            sum += term;
            term = 0.5*term;
            count++;
        }
        System.out.println(sum);
    }
}
