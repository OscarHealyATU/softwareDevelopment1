import java.util.Scanner;

/**
 * quest
 */
public class quest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double money  = 12.38;
        String ans = "n";
        // plot
        System.out.println("An injured man aaproaches you in the woods: 'Good day Sir, apologies for interupting you on your walk but i need your help! will you come along with me?!'");
        System.out.println("Enter 'Y' for yes and 'N' for no");
        // answer
        ans = input.next();
        if (ans.equals("n")  ||ans.equals("N") )  {
            System.out.println("The man becomes even more desperate and starts begging for you for help, A bear then comes out from behind you, pouncing on the man and rips out his entrails, and throws the now screaming stranger to the side. The bear then turns to you");
        }
        if (ans.equals("y")  ||ans.equals("Y") )  {
            System.out.println("The man exclaims thank the Gods! He introduces himself as a Julie Jeweller. ");
        }

    }
}