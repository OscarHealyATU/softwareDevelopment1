import java.util.Scanner;

public class Small {
    public static void main(String[] args) {
int smallestValue = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of integer values: ");
        int number = input.nextInt();

        for(int i = 1; i <= number; i++){
            System.out.print("Enter integer " + i + " : ");
            int value = input.nextInt();
            if(smallestValue >value || i == 1) {
                smallestValue = value;
            }
        }
        input.close();
        System.out.println("\nSmallest number is " + smallestValue);
       
    }
}
