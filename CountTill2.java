import java.util.Scanner;

public class CountTill2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] denominations = {1,2,5,10,20,50,100};
        double[] coin ={0,0,0,0,0,0,0};
        double total=0; 
        
        for (int i = 0; i < denominations.length; i++) {
            System.out.print("Enter €" + denominations[i] + " coins: ");
            coin[i] = input.nextDouble();   
            total += coin[i]*denominations[i];
            
        }
        System.out.println("Total: " + total);

        
        input.close();
    }
}
