package Lab_18;
import java.util.Scanner;
public class Guess2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String keepPlaying = "y";
        int guess, 
            ans = 5, 
            counter=0;
            do{
                if (counter%2==0) {
                    ans +=counter;    
                }else{
                    ans -=counter;
                }
                
                counter=0;
        do {
            counter++;
            
        System.out.print("Guess the number: ");
        guess = input.nextInt();
        }while (guess != ans);    
        System.out.println("Good guess. It is " + ans + ". It took you " + counter + " attempts to guess the number");
        System.out.print("Play again? (y/n)?: ");
        keepPlaying = input.next();
    } while(keepPlaying.equals("y") || keepPlaying.equals("Y"));   
    System.out.println("Game Over");
    input.close();       
}

}
