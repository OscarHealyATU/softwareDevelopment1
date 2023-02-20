import java.util.Scanner;

public class Grades2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double i = 1;
        double average = 0, count = 0;
        while (i != -1){
            System.out.print("Enter grade (-1 to quit)" + i + ": ");
            i = input.nextDouble();
            average += i;
            count ++;
        }
        input.close();
        average /= cou;
        System.out.println("Grade average: " + average);
    
    }
}
