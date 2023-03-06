package Lab_019;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double classAVG = 0;
        int total = 0, 
            score = 0, 
            count=-1;

        do {
            total+=score;
            count ++;
            System.out.print("Enter Grade " + count + ": (-1 to quit): ");
            score = input.nextInt();
 
        } while (score != -1); input.close();
        
        classAVG = (double) total/count;
        System.out.println("Average grade is " + classAVG);
    }
}
