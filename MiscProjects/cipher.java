package MiscProjects;
import java.util.Scanner;

public class cipher {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter in String to be shifted, no spaces or numbers");
        String cipher = input.next();
        
        System.out.println("enter in shift number");
        
        int shift = input.nextInt();
        
        System.out.println("is it shifted left?");
        String direction = input.next();
        
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        
        
        int[] cipherArray = new int[cipher.length()];
        
        if (direction.equals("yes") || direction.equals("y") || direction.equals("Y")) {
            shift = shift * -1;
        }
        input.close();
        
        System.out.println("result");
        for (int i = 0; i < cipher.length(); i++) {
        
            cipherArray[i] = cipher.charAt(i);
            System.out.print(alphabet[i+shift+26]);
        }
        
        
    }

    
}