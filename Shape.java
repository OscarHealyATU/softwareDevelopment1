import java.util.Scanner;

/**
 * Shape
 */
public class Shape {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Choose a shape\n 1. Square \n 2. Triangle");
        System.out.print("Enter your choice (1 or 2): ");
        int ans = input.nextInt();
        input.close();
        switch (ans) {
            case 1:
            System.out.println("*  *  *  *\n*  *  *  *\n*  *  *  *\n*  *  *  *");
                break;

            case 2:
            System.out.println("\n      *  \n     *  *  \n   *  *  *\n *  *  *  * \n*  *  *  *  *");
                break;
        
            default:
            System.out.println("Not a valid answer \ncan't print shape");
                break;
        }
        
    }
}