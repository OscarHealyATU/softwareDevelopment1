import java.util.*;
public class InputString{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        System.out.println("Enter your first name");
        name = input.next();
        System.out.println("your name is " + name);

        input.close();
    }

    }
