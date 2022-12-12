import java.util.Scanner;

public class cipher {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter in String to be shifted, no spaces");
        String cipher = input.next();
        System.out.println("enter in shift number");
        int shift = input.nextInt();
        System.out.println("is it shifted left?");
        boolean left = input.nextBoolean();
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',};
        if (left) {
            shift = shift * -1;
        }
        input.close();
        
        for (int i = 0; i < cipher.length(); i++) {
            int val;
            switch (cipher.charAt(i)) {
                case ' ':
                val = 0;
                break;
                case 'a':
                val = 1;
                break;
                case 'b':
                val = 2;
                break;
                case 'c':
                val = 3;
                break;
                case 'd':
                val = 4;
                break;
                case 'e':
                val = 5;
                break;
                case 'f':
                val = 6;
                break;
                case 'g':
                val = 7;
                break;
                case 'h':
                val = 8;
                break;
                case 'i':
                val = 9;
                break;
                case 'j':
                val = 10;
                break;
                case 'k':
                val = 11;
                break;
                case 'l':
                val = 12;
                break;
                case 'm':
                val = 13;
                break;
                case 'n':
                val = 14;
                break;
                case 'o':
                val = 15;
                break;
                case 'p':
                val = 16;
                break;
                case 'q':
                val = 17;
                break;
                case 'r':
                val = 18;
                break;
                case 's':
                val = 19;
                break;
                case 't':
                val = 20;
                break;
                case 'u':
                val = 21;
                break;
                case 'v':
                val = 22;
                break;
                case 'w':
                val = 23;
                break;
                case 'x':
                val = 24;
                break;
                case 'y':
                val = 25;
                break;
                case 'z':
                val = 26;
                break;
                                
                default:
                val = -1;
                    break;
            }
            if (val == -1){
                System.out.print("z");
            } else if (val != 0) {
                      //  System.out.print(val);
                      val = val + shift;
                      if (val > 26) {
                        val = val - 26;
                      }else if (val < 0) {
                        val = val + 26;
                      }
                      


             
        }else  {
                System.out.print(" ");
            }System.out.print(alphabet[val-1]); 
        }
        
    }

    
}