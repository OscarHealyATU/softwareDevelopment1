package Lab_10;
import java.util.Scanner;

public class Quiz1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ans;

        int count = 0;
        boolean 
        q1 = false, 
        q2 = false, 
        q3 = false, 
        q4 = false, 
        q5 = false;
        
        
        

        // Q1
        System.out.println("Q.1");
        System.out.println("---------------------------");
        System.out.println("\nThe following code produces which output to the screen:\n\n");
        System.out.println(" int x = 65;\n if(x > 65){\n\tSystem.out.println(x);\n}");
        System.out.println("\n\n is it \nA.|\t65 \nB.|\tNothing is printed to the screen");
        System.out.print("----------------\n\n|");
        ans = input.nextLine();

        // Answer decision
        if (ans.equals("a")) {
            q1 = true;
            count++;

            System.out.println("|\tcorrect!");  
                 
        }else {
            System.out.println("|\tincorrect!");
        }  

        // Q2
        System.out.println("Q.2");
        System.out.println("---------------------------");
        System.out.println("\nWrite a line of code to assign an isntance of the Scanner object for user input to a variable named sc:\n");
        System.out.print("----------------\n\n|");
        ans = input.nextLine();

        if (ans.equals("Scanner sc = new Scanner(System.in);")) {
            q2 = true;
            count ++;

            System.out.println("|\tcorrect!");
        }else {
            System.out.println("|\tincorrect!");
        }

        // Q3
        System.out.println("Q.3");
        System.out.println("---------------------------");
        System.out.println("\nint x = 1;\nint y = 2;\n\nif(x == 1 && y == 2) {\n\tSystem.out.println(true);\n} else {\n\tSystem.out.println(false);\n}\n\n");
        System.out.println("Is it \nA.|\t false \nB.|\t true \nC.|\t no output\n");
        System.out.print("----------------\n\n|");
        ans = input.nextLine();

         switch (ans) {
            case "a":
                System.out.println("|\tincorrect!");
                break;
                case "b":
                count ++;
                q3 = true;
                System.out.println("|\tcorrect!");
                break;
                case "c":
                System.out.println("|\tincorrect!");
                break;
         
            default:
            System.out.println("|\tinvalid answer");
                break;
         }

        // Q4
        System.out.println("Q.4");
        System.out.println("---------------------------");
        System.out.println("\nint x = 1;\n\nif (x != 1) {\n\tSystem.out.println('not equal to 1');\n} else {\n\tSystem.out.println('equal to 1');\n}\n\n");
        System.out.println("Is it \nA.|\t not equal to 1 \nB.|\t equal to 1 \nC.|\t no output\nD.|\t error\n");
        System.out.print("----------------\n\n|");
        ans = input.nextLine();

        switch (ans) {
           case "a":
               System.out.println("|\tincorrect!");
               break;
               case "b":
               count ++;
               q4 = true;
               System.out.println("|\tcorrect!");
               break;
               case "c":
               System.out.println("|\tincorrect!");
               break;
               case "d":
               System.out.println("|\tincorrect!");
               break;
        
           default:
           System.out.println("|\tinvalid answer");
               break;
        }

        // Q5
        System.out.println("Q.5");
        System.out.println("---------------------------");
        System.out.println("How many choices are possible when  using a single if-else statement?");
        System.out.println("select one:\n\nA.|\t One\nB.|\t Two\nC.|\t Three\nD.|\t Four\n");
        System.out.print("----------------\n\n|");
        ans = input.nextLine();

        switch (ans) {
            case "a":
                System.out.println("|\tincorrect!");
                break;
            case "b":
                System.out.println("|\tincorrect!");
                break;
            case "c":
                count ++;
               q5 = true;
                System.out.println("|\tcorrect!");
                break;
            case "d":
                System.out.println("|\tincorrect!");
                break;
        
            default:
                System.out.println("|\tinvalid answer");
                break;
        }
        input.close();

        // quiz results
        System.out.println("Quiz Finished");
        System.out.println("\n Scored " + count*2 + "0%");
        
        if (count >= 4) {
            System.out.println("Distinction");
        }else if (count >= 2) {
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }

        System.out.println("question 1: " + q1);
        System.out.println("question 2: " + q2);
        System.out.println("question 3: " + q3);
        System.out.println("question 4: " + q4);
        System.out.println("question 5: " + q5);


    }
}
