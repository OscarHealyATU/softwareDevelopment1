package Semester_02.Lab_18;

public class Five {
    public static void main(String[] args) {
        int i = 5;
        while (i <= 50) {
            System.out.print(i);
            if (i!=50) {
                System.out.print(" , ");
            }
            i+=5;
        }
    }
}
