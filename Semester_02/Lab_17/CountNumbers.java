package Semester_02.Lab_17;
import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1, 
            num = 0, 
            oddCount = 0, 
            evenCount = 0, 
            zCount = 0;

        while (i == 1) {      
            System.out.print("Enter number: "); 
            num = input.nextInt();
            if (num == 0) {
                zCount++;
            }else if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            System.out.print("loop again: (1 for yes 2 for no): ");
            i = input.nextInt(); 
        }
        input.close();
        
        System.out.println("sum of even numbers: " + evenCount);
        System.out.println("sum of even numbers: " + oddCount);
        System.out.println("Zero Numbers: " + zCount);
    }
}
