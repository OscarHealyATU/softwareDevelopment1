package Lab_21;

import java.util.Scanner;

public class CreateArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("int or double array?");
        System.out.print("Enter 1 for int and 2 for double array: ");
        int type = input.nextInt();
        System.out.print("how many values do you need to store in the array: ");
        int length = input.nextInt();
        int output = "";
        if (type == 1) {
            int[] values = new int[length]; 
            for (int i = 0; i < values.length; i++) {
                System.out.print("Enter value"+(i+1)+": ");
                values[i] = input.nextInt();
                
            }
        } else if (type == 2) {
            double[] values = new double[length]; 
            for (int i = 0; i < values.length; i++) {
                System.out.print("Enter value"+(i+1)+": ");
                values[i] = input.nextDouble();
            }  
        }

    }
}
