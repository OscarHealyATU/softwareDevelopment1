package Lab_08;
import java.util.Scanner;

public class Pizza {

    public static void main(String[] args) {
        
     Scanner input = new Scanner(System.in);
     double pizzaCost;
     String topping;
     int sliceCount, day, month, year;
          
     System.out.print("\nEnter the cost of pizza in your area: ");
     pizzaCost = input.nextDouble();
     System.out.print("\nEnter a favourite one-word topping: ");
     topping = input.next();
     System.out.print("\nEnter number of slices of pizza you would eat in one sitting: ");
     sliceCount = input.nextInt();
     System.out.print("\nEnter a numerical value for day: ");
     day = input.nextInt();
     System.out.print("\nEnter a numerical value for month: ");
     month = input.nextInt();
     System.out.print("\nEnter a numerical value for year: ");
     year = input.nextInt();

     System.out.println("Why not treat yourself to dinner on " + day + "/" + month + "/" + year + ".");
     System.out.println("have " + sliceCount + " slices of " + topping + " pizza!\n It will only cost you " + pizzaCost + ".");
     input.close();

    }
}