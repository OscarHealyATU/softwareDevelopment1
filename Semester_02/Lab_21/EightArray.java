package Lab_21;

import java.util.Scanner;

public class EightArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to remove from array: ");
        int number = input.nextInt(); input.close();
        
        int[] x = {23,104,3,65,1002,90000,77,88,99,10};
        int[] y = new int[x.length-1];
        int flag = -1;
        boolean checker = false;
        
        // check if number is in array
        for (int i = 0; i < x.length; i++) {
            if (x[i] == number) {
                checker = true; 
                flag = i;
            }
        }
        // if number is in array pass to new array
        if (checker) {
            int count = 0;
            for (int i = 0; i < y.length; i++) {
                if (count == flag) count++;
                y[i] = x[count]; 
                count++;
            }
        } else {
            System.out.println("Number not found");
        }
        for (int i = 0; i < y.length; i++) {
            System.out.println(i+"\t"+y[i]);
        }

    }
}
