package Lab_13;

import java.util.Scanner;

public class Fullname2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fullName, fName, mName, lName;
        System.out.println("Type in your first name.");
        fName = input.next();
        System.out.println("Type in your middle name/initial.");
        System.out.println("Press # if none");
        mName = input.next();
        System.out.println("Type in your last name.");
        lName = input.next();
        input.close();
        
        if(mName.equals("#")) {
            fullName = fName.concat(" ").concat(lName);    
            System.out.println(fullName);
        } else {
            fullName = fName.concat(" ").concat(mName).concat(" ").concat(lName);
            System.out.println(fullName);
        }
    }
}
