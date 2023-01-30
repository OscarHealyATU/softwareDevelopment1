package Semester_01.Lab_03;
public class PetrolReceipt {

    static String edge = "+-----------------------+";
    static String empty = "|                       |"; 
    static String name = "Garage";
    public static void main(String[] args){

        String date = "10-Oct-2022";
        String time = "09:10pm";
        double litres =44.00;
        double price = 1.15;
        double total = price * litres + 0.000000000000006; 


        
        System.out.println("+-----------------------+");
        System.out.println("|\t\t\t|");
        System.out.println("|\tLocal Garage\t|");
        System.out.println("|\t\t\t|");
        System.out.println("| " + date + "\t"+ time + "\t|");
        System.out.println("|\t\t\t|");
        System.out.println("| Litres:\t" + litres + "\t|");
        System.out.println("| price/Litre: " + price + "\t|");
        System.out.println("|\t\t\t|");
        System.out.println("| Fuel Total: " + total + "\t|");
        System.out.println("|\t\t\t|");
        System.out.println("+-----------------------+"); 
    }
}
