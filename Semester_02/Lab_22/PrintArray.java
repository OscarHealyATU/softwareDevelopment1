package Lab_22;

public class PrintArray {
    public static void main(String[] args) {
        PrintArray print = new PrintArray();
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        print.outputArray(numbers);
    }

    void outputArray(int[] x) {
        System.out.println("Index\tValue\tSquare");
        System.out.println("=====\t=====\t======");
        for (int i = 0; i < x.length; i++) {
            System.out.println(i + "\t" + x[i] + "\t" + (x[i]*x[i]));
        }
    }
}
