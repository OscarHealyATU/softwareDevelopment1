package Lab_21;

public class FourthArray {
    public static void main(String[] args) {
        int[] x ={7,6,11,15,19};
        int sum =0;

        for(int i = 0; i < x.length; i++){
            sum += x[i];
        }
        System.out.println("Sum of array values is: " + sum);
    }
}
