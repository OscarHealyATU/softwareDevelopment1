import java.util.*;
public class ScannerExample {

    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        String name;
        int age;

        System.out.println("Enter your name: ");
        name = input.next();
        System.out.println("Thank you " + name +" for your patience");
        System.out.println("Please enter your age");
        age = input.nextInt();
        if(age < 18){
            System.out.println("Your not " + age);
        }else{
        System.out.println("wow.. "+ age +" thats old");
        }
        //have to close input
        input.close();  
    }
    
}
