package Lab_14;
import java.util.Scanner;

public class NinthLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 1, total = 0, grade;
        double avg;
        while (count <= 5) {
            System.out.println("Enter grade for student " + count);
            grade = input.nextInt();
            total += grade;
            count++;
        }
        input.close();
        avg = (double) total/(count-1);
        System.out.println("total " + total);
        System.out.println("average " + avg);
    }
}
