import java.util.Scanner;

// is seven?
public class Seven {

    public static void main(String[] args) {
        int numInput = -1, seven = 7;
        
        Scanner input = new Scanner(System.in);
        System.out.println("input a number");
        numInput = input.nextInt();
        if (numInput != seven) {
            System.out.println("it's a cool number but it's not " + seven + "...");
        }else{
            System.out.println("Nice");
        }
        input.close();
    }
}