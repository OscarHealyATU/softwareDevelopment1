import java.util.Scanner;

/**
 * Login
 */
public class Login {

    public static void main(String[] args) {
    // users
    int user1ID = 1000;
    int user2ID = 2000;
    String userName1 = "Healy", userName2 = "Oscar";      
    // scanner
        Scanner input = new Scanner(System.in);
        System.out.println("enter your log in details here: ");
        System.out.println("enter your User ID: ");
        int UserIDInp = input.nextInt(); 
        
        System.out.println("enter your Username here: ");
        String userNameInp = input.next();

        if (UserIDInp == user1ID && userNameInp.equals(userName1) ||(UserIDInp == user2ID && userNameInp.equals(userName2))) {
            System.out.println("You are logged in");
        }else{
            System.out.println("Sorry not a valid user");
        }
        input.close();
    }
}