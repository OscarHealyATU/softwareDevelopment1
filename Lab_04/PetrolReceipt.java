public class PetrolReceipt {

    static String edge = "+-----------------------+";
    static String empty = "|                       |"; 
    static String name = "Garage";
    public static void main(String[] args){

        String date = "10-Oct-2022";
        String time = "09:10pm";
        double litres =44.00;
        double price = 1.15;
        double total = price * litres; 
        System.out.println("+-----------------------+");
        System.out.println("|                       |");
        System.out.println("|Local Garage           |");
        System.out.println("|                       |");
        System.out.println("|10-Oct-2022    09:10pm |");
        System.out.println("|                       |");
        System.out.println("|Litres:    44.00       |");
        System.out.println("|price/Litre: 1.15      |");
        System.out.println("|                       |");
        System.out.println("|Fuel Total: 50.60      |");
        System.out.println("|                       |");
        System.out.println("+-----------------------+"); 
    }
}
