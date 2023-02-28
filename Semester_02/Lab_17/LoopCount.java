import java.util.Scanner;

public class LoopCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i =0;

        System.out.print("want to loop:(0 for yes 1 for no): ");  
        i = input.nextInt();  
        while (i == 0) {
            System.out.print("loop again: (0 for yes 1 for no): ");
        i = input.nextInt(); 
        }
        System.out.println("finished looping.");
        input.close();
    }
}