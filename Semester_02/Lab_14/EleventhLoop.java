package Lab_14;
/**
 * EleventhLoop
 */
public class EleventhLoop {

    public static void main(String[] args) {
        int count = 0, 
            sum=0;

        System.out.print("Sum of the numbers 1 to 75: ");
        while (count <=75) {
            sum+=count;
            count++;
        }
        System.out.print(sum);
    }
}