package Semester_01.Lab_04;

import java.util.Scanner;

public class League {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String team1;
        String team2;
        String team3;
        String team4;

        int points1;
        int points2;
        int points3;
        int points4;

        System.out.println("enter first team details");
        System.out.println("team name: ");
        team1 = input.next();
        System.out.println("points scored: ");
        points1 = input.nextInt();

        System.out.println("enter second team details");
        System.out.println("team name: ");
        team2 = input.next();
        System.out.println("points scored: ");
        points2 = input.nextInt();

        System.out.println("enter third team details");
        System.out.println("team name: ");
        team3 = input.next();
        System.out.println("points scored: ");
        points3 = input.nextInt();

        System.out.println("enter fourth team details");
        System.out.println("team name: ");
        team4 = input.next();
        System.out.println("points scored: ");
        points4 = input.nextInt();

        System.out.println("-------------------------");
        System.out.println("|#|Team\t\t|points\t|");
        System.out.println("-------------------------");
        System.out.println("|1|" + team1 + "\t|" + points1 + "\t|");
        System.out.println("-------------------------");
        System.out.println("|1|" + team2 + "\t|" + points2 + "\t|");
        System.out.println("-------------------------");
        System.out.println("|1|" + team3 + "\t|" + points3 + "\t|");
        System.out.println("-------------------------");
        System.out.println("|1|" + team4 + "\t|" + points4 + "\t|");
        System.out.println("-------------------------");

        input.close();
    }
}
