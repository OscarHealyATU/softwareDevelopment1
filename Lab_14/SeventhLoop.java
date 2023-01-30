package Lab_14;
public class SeventhLoop {
    public static void main(String[] args) {
        int count = 1;
        while (count < 11) {
            if (count % 2 == 0) {
                System.out.println("Even Number: " + count);
            }
            count++;
        }
    }
}
