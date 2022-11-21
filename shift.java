import java.util.Scanner;

public class shift {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("do you have a Ceaser cipher or a vigenere cipher? (type C or V");
        //char type = input.nextChar();
       // if(type == 'C' || type == 'c'){
            
        System.out.println("Enter in String to be shifted, no spaces");
        String cipherStr = input.next();
        System.out.println("How many letters shifted?");
        int shift = input.nextInt();

        char[] cipherArr = new char[cipherStr.length()];
        char[] resultArr = new char[cipherStr.length()];
        char[] alphabet  = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        //               =   1   2   3   4   5   6   7   8   9  10  11  12  13  14  15  16  17  18  19  20  21  22  23  24  25  26
        System.out.println("you typed: ");
        
        for (int i = 0; i < cipherArr.length; i++) {
            cipherArr[i] = cipherStr.charAt(i);
            System.out.print(cipherArr[i] + "\t");
        }
        System.out.println("");

        for (int i = 0; i < cipherArr.length; i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (alphabet[j] == cipherArr[i]) {
                    // prints out shifted location
                    if (j+ shift > 26) {
                        resultArr[i] = alphabet[j + shift - 26];
                        System.out.print((j + 1 + shift) + "\t");
                    }else if (j+shift <= 0) {
                        resultArr[i] = alphabet[j + shift + 26];
                        System.out.print((j + 1 + shift) + "\t");
                    }else{
                    resultArr[i] = alphabet[j+shift];
                    System.out.print((j + 1 + shift) + "\t");
                    }
                }
            } 
        }
     System.out.println("");
     
        for (int i = 0; i < resultArr.length; i++) {
            System.out.print(resultArr[i] + "\t");
            
        }
        input.close();
      }
    }
