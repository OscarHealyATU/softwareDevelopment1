package Lab_08;
import java.util.Scanner;

/**
 * Grades
 */
public class Grades {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        String stud01,stud02,stud03,stud04,stud05,stud06,stud07,stud08,stud09,stud10;
        int total,grade01,grade02,grade03,grade04,grade05,grade06,grade07,grade08,grade09,grade10,studCount = 0;
        double avg;
       
        // 001
        studCount = studCount + 1;
        System.out.print("\nEnter Student " + studCount + "'s' Id: ");
        stud01 = input.next();
        System.out.print("\nEnter grade for student " + studCount + " ");
        grade01 = input.nextInt();

        // 002
        studCount = studCount + 1;
        System.out.print("\nEnter Student " + studCount + "'s' Id: ");
        stud02 = input.next();
        System.out.print("\nEnter grade for student " + studCount + " ");
        grade02 = input.nextInt();

        // 003
        studCount = studCount + 1;
        System.out.print("\nEnter Student " + studCount + "'s' Id: ");
        stud03 = input.next();
        System.out.print("\nEnter grade for student " + studCount + " ");
        grade03 = input.nextInt();

        // 004
        studCount = studCount + 1;
        System.out.print("\nEnter Student " + studCount + "'s' Id: ");
        stud04 = input.next();
        System.out.print("\nEnter grade for student " + studCount + " ");
        grade04 = input.nextInt();

         // 005
         studCount = studCount + 1;
         System.out.print("\nEnter Student " + studCount + "'s' Id: ");
         stud05 = input.next();
         System.out.print("\nEnter grade for student " + studCount + " ");
         grade05 = input.nextInt();
 
         // 006
         studCount = studCount + 1;
         System.out.print("\nEnter Student " + studCount + "'s' Id: ");
         stud06 = input.next();
         System.out.print("\nEnter grade for student " + studCount + " ");
         grade06 = input.nextInt();
 
         // 007
         studCount = studCount + 1;
         System.out.print("\nEnter Student " + studCount + "'s' Id: ");
         stud07 = input.next();
         System.out.print("\nEnter grade for student " + studCount + " ");
         grade07 = input.nextInt();

          // 008
        studCount = studCount + 1;
        System.out.print("\nEnter Student " + studCount + "'s' Id: ");
        stud08 = input.next();
        System.out.print("\nEnter grade for student " + studCount + " ");
        grade08 = input.nextInt();

        // 009
        studCount = studCount + 1;
        System.out.print("\nEnter Student " + studCount + "'s' Id: ");
        stud09 = input.next();
        System.out.print("\nEnter grade for student " + studCount + " ");
        grade09 = input.nextInt();

        // 010
        studCount = studCount + 1;
        System.out.print("\nEnter Student " + studCount + "'s' Id: ");
        stud10 = input.next();
        System.out.print("\nEnter grade for student " + studCount + " ");
        grade10 = input.nextInt();    
        
        input.close();

        //total + average calculation
        total = (grade01 + grade02 + grade03 + grade04 + grade05 + grade06 + grade07 + grade08 + grade09 + grade10); 
        avg  = total / studCount;
        int count = 1;

        System.out.println("");
        System.out.println("---------------------------------");
        System.out.println("|#\t|Student No\t|Grade\t|");
        System.out.println("---------------------------------");
        //001
        System.out.println("|" + count + "\t|" + stud01 + "\t|"+ grade01 + "\t|");
        System.out.println("---------------------------------");
        count = count + 1;
        //002
        System.out.println("|" + count + "\t|" + stud02 + "\t|"+ grade02 + "\t|");
        System.out.println("---------------------------------");
        count = count + 1;
        //003
        System.out.println("|" + count + "\t|" + stud03 + "\t|"+ grade03 + "\t|");
        System.out.println("---------------------------------");
        count = count + 1;
        //004
        System.out.println("|" + count + "\t|" + stud04 + "\t|"+ grade04 + "\t|");
        System.out.println("---------------------------------");
        count = count + 1;
        //005
        System.out.println("|" + count + "\t|" + stud05 + "\t|"+ grade05 + "\t|");
        System.out.println("---------------------------------");
        count = count + 1;
        //006
        System.out.println("|" + count + "\t|" + stud06 + "\t|"+ grade06 + "\t|");
        System.out.println("---------------------------------");
        count = count + 1;
        //007
        System.out.println("|" + count + "\t|" + stud07 + "\t|"+ grade07 + "\t|");
        System.out.println("---------------------------------");
        count = count + 1;
        //008
        System.out.println("|" + count + "\t|" + stud08 + "\t|"+ grade08 + "\t|");
        System.out.println("---------------------------------");
        count = count + 1;
        //009
        System.out.println("|" + count + "\t|" + stud09 + "\t|"+ grade09 + "\t|");
        System.out.println("---------------------------------");
        count = count + 1;
        //010
        System.out.println("|" + count + "\t|" + stud10 + "\t|"+ grade10 + "\t|");
        System.out.println("---------------------------------");
        count = count + 1;
        // Total score
        System.out.println("|\t|Total\t\t|"+ total + "\t|");
        System.out.println("---------------------------------");
        // Average score
        System.out.println("|\t|Average\t|"+ avg + "\t|");
        System.out.println("---------------------------------");
        
    }
}