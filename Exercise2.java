import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int point, gameCount;
        double avg;

        System.out.print("Enter team name:");
        name = input.next();

        System.out.print("Enter number of points:");
        point = input.nextInt();

        System.out.print("Enter number of games:");
        gameCount = input.nextInt();
        input.close();
        avg = point;
        avg = avg/gameCount;

        System.out.println(name + " have played " + gameCount + " and scored " + point + " points.");
        System.out.println("Average points per game is: " + avg);
    }
}
