package Lab_21;

public class ThirdArray {
    public static void main(String[] args) {
        int[] x = new int[5];
        System.out.println("Index\tValue\n");
        for (int i = 0; i < x.length; i++) {
            x[i] = i+1;
            // i is nth loop, tab, x[i] is array position
            System.out.println(i + "\t" + x[i]);
        }
    }
}
