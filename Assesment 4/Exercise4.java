public class Exercise4 {
    public static void main(String[] args) {
        String output = "";
        int row = 5, coloumn = 1; // colounms start at 8 and increment 2 at a time 
        int number = 0; // number variable for readability
        
        for (int i = 1; i <= row; i++) {
            output += "\n" + i + ": ";
            for (int j = 4; j >= coloumn; j--) {
                number = j * 2;
               if (number !=2) output += number + ", ";
               else output += number + " ";
            }
        }
        System.out.println(output);
    }
}
