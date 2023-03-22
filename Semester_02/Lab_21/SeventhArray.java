package Lab_21;

public class SeventhArray {
    public static void main(String[] args) {
        int[] x = {23,104,3,65,1002,90000,77,88,99,10};
        int[] y = new int[x.length];
        int count = x.length;

        for (int i = 0; i < x.length; i++) {
            count--;
            y[i] = x[count];
        }
        System.out.println("Index\tBefore\tAfter\n-----\t------\t-----");
        for (int i = 0; i < y.length; i++) {
            System.out.println(i + "\t" + x[i] + "\t" + y[i]);
        }

    }
}
