package Lab_14;
public class TwelfthLoop {
    public static void main(String[] args) {
        int count = 1, sum=1;
        System.out.print("Sum of the numbers 1 to 75: ");
        
        while (count <=10) {
            sum*=count;
            count++;
        }
        System.out.print(sum);
    }
}
