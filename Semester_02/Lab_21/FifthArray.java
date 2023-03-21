package Lab_21;

import java.util.Scanner;

public class FifthArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String output = "\nIndex\tValue\n-----\t-----\n";
        int[] x = new int[8];
        double avg = 0;
                
        for (int i = 0; i < x.length; i++) {
            System.out.print("enter value for element: ");
            x[i] = input.nextInt();
            avg +=x[i];
                // loop | tab | array 
            output+=i + "\t" + x[i]+"\n";
        }
        input.close();
        avg /= x.length;
        output += "\nAverage: " + avg;
        System.out.println(output);   
    }
}
