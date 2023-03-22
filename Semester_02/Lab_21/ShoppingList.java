package Lab_21;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many items do you want to add: ");
        String[] items = new String[input.nextInt()];
        
        for (int i = 0; i < items.length; i++) {
            System.out.print("Add item " + (i+1)+ " to the list: ");
            items[i] = input.next();
        }

        System.out.println("Shopping List:");
        for (int i = 0; i < items.length; i++) {
            System.out.println((i+1)+". "+items[i]);
        }
    }
}
