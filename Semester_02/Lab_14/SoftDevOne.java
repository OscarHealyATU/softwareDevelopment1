package Lab_14;
public class SoftDevOne {
    public static void main(String[] args) {
        int count = 1;
        while (count<=30) {
            switch (count) {
                case 4:
                    System.out.println("Soft");
                    break;
                case 15:
                    System.out.println("Dev");
                    break;
                case 21:
                    System.out.println("One");
                    break;
                default:
                System.out.println(count);
                    break;
            }
            count++;
        }
    }
}
