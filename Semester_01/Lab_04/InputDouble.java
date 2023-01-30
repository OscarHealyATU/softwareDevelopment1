import java.util.*;

public class InputDouble {
    
    public static void main(String[] args) {
        double dNum;
        Scanner input = new Scanner(System.in);
        System.out.println("enter a decimal number");
        dNum = input.nextDouble();
        System.out.println("number is " + dNum);

        input.close();
    }
}
