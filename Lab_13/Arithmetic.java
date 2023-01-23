package Lab_13;
import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter in five numbers, press enter button after each");
        int a = input.nextInt(), 
            b = input.nextInt(), 
            c = input.nextInt(),
            d = input.nextInt(), 
            e = input.nextInt();

            System.out.println("Value of a, "+a+", after adding "+(a+=9));
            System.out.println("Value of a, "+b+", after subtracting "+(b-=4));
            System.out.println("Value of a, "+c+", after multiplying "+(c*=3));
            System.out.println("Value of a, "+d+", after dividing "+(d/=2));
            System.out.println("Remainder value of assigned to e, "+e+", after dividing e by 5: "+(e%=5));
       
            input.close();
    }
}
