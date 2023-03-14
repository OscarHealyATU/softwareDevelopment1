import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        input.close();

        // don't need brackets for one statement so i took them out
             if(number >=20 && number<=30) number+=10;
        else if(number >=50 && number<=60) number+=20;
        else number+=30;
        
        System.out.print("number updated: " + number);

    }
}
