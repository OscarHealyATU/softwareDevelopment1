package Semester_01.Lab_06;

public class Display {
    public static void main(String[] args) {
        int x = 2,
            y = 3;

        System.out.printf("x = %d%n", x);
        System.out.printf("Value of %d + %d is %d%n", x, x, (x + x));
        System.out.printf("x =");
        System.out.printf("%d = %d%n", (x + y), (y + x)); 
    }
}
