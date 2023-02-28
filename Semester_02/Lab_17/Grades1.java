import java.util.Scanner;

public class Grades1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1;
        double average = 0;
        while (i <= 10) {
            System.out.println("enter grade " + i + ": ");
            average += input.nextDouble();
            i++;
        }
        input.close();
        average /= (i-1);
        System.out.println("Grade average: " + average);
    }
}
