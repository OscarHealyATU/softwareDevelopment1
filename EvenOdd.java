import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int isEqual = input.nextInt(),num = isEqual;
        isEqual %= 2;
        
        if (isEqual == 0) {
            System.out.println("the number "+num+" is equal");
        }else {
            System.out.println("the number "+num+" is not equal");
        }
        input.close();
    }
}
