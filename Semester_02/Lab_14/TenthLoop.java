package Lab_14;
public class TenthLoop {
    public static void main(String[] args) {
        int count = 0, sqr, cube;
        System.out.println("Number\tSquare\tCube");

     while (count <= 10) {
        sqr = count * count;
        cube = count * count * count;
        System.out.println(count  + "\t" + sqr + "\t" + cube);
        count++;
     }   
    }
}
