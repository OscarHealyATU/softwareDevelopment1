package Semester_01.Lab_04;
import java.util.Scanner;

public class EFL {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String team1;
        String team2;
        String team3;
        String team4;

        int points1, p1, w1, d1, l1;
        int points2, p2, w2, d2, l2;
        int points3, p3, w3, d3, l3;
        int points4, p4, w4, d4, l4;

        System.out.println("enter first team details");
        System.out.println("team name: ");
        team1 = input.next();
        System.out.println("Games played: ");
        p1 = input.nextInt();
        System.out.println("Games won: ");
        w1 = input.nextInt();
        System.out.println("Games drawn: ");
        d1 = input.nextInt();
        System.out.println("Games lost: ");
        l1 = input.nextInt();
        System.out.println("points scored: ");
        points1 = input.nextInt();

        System.out.println("enter second team details");
        System.out.println("team name: ");
        team2 = input.next();
        System.out.println("Games played: ");
        p2 = input.nextInt();
        System.out.println("Games won: ");
        w2 = input.nextInt();
        System.out.println("Games drawn: ");
        d2 = input.nextInt();
        System.out.println("Games lost: ");
        l2 = input.nextInt();
        System.out.println("points scored: ");
        points2 = input.nextInt();

        System.out.println("enter third team details");
        System.out.println("team name: ");
        team3 = input.next();
        System.out.println("Games played: ");
        p3 = input.nextInt();
        System.out.println("Games won: ");
        w3 = input.nextInt();
        System.out.println("Games drawn: ");
        d3 = input.nextInt();
        System.out.println("Games lost: ");
        l3 = input.nextInt();
        System.out.println("points scored: ");
        points3 = input.nextInt();

        System.out.println("enter fourth team details");
        System.out.println("team name: ");
        team4 = input.next();
        System.out.println("Games played: ");
        p4 = input.nextInt();
        System.out.println("Games won: ");
        w4 = input.nextInt();
        System.out.println("Games drawn: ");
        d4 = input.nextInt();
        System.out.println("Games lost: ");
        l4 = input.nextInt();
        System.out.println("points scored: ");
        points4 = input.nextInt();

        System.out.println("---------------------------------------------------------");
        System.out.println("|#|Team\t\t|P\t|W\t|D\t|L\t|Points\t|");
        System.out.println("---------------------------------------------------------");
        System.out.println("|1|" + team1 +  "\t|" + p1 +"\t|" +  w1 +"\t|" +  d1 +"\t|" +  l1 + "\t|" + points1 + "\t|");
        System.out.println("---------------------------------------------------------");
        System.out.println("|2|" + team2 + "\t|" + p2 +"\t|" +  w2 +"\t|" +  d2 +"\t|" +  l2 + "\t|" + points2 + "\t|");
        System.out.println("---------------------------------------------------------");
        System.out.println("|3|" + team3 + "\t|" + p3 +"\t|" +  w3 +"\t|" +  d3 +"\t|" +  l3 + "\t|" + points3 + "\t|");
        System.out.println("---------------------------------------------------------");
        System.out.println("|4|" + team4 + "\t|" + p4 +"\t|" +  w4 +"\t|" +  d4 +"\t|" +  l4 + "\t|" + points4 + "\t|");
        System.out.println("---------------------------------------------------------");

        input.close();
    }
}