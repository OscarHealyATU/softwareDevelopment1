package Semester_02.Lab_17;
import java.util.Scanner;

public class Grades2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double i = 1, 
         average = 1, 
          count = -1;
        while (i != -1){
            System.out.print("Enter grade (-1 to quit)" + count + ": ");
            i = input.nextDouble();
            average += i;
            count ++;
        }
        input.close();
        System.out.println(average);
        average /= count;
        System.out.println("Grade average: " + average);
    
    }
}
