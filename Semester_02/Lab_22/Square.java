package Lab_22;

public class Square {
    public static void main(String[] args) {
        Square sq = new Square();
        System.out.println("Number\tSquare\n******\t******");
        for (int i = 2; i < 8; i++) {
            System.out.println(i + "\t" + sq.squareOf(i));
        }
    }

   int squareOf(int x){
        return x*x;
    }
}
