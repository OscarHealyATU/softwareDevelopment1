package Lab_22;

public class Power {
    public static void main(String[] args) {
        System.out.println(powerOf(2, 3));
    }

    static int powerOf(int x, int power){
        for (int i = 0; i < power; i++) {
            x*=x;
            System.out.println(x);
        }
        return x;
    }
}
