package Lab_22;

public class Average {
    public static void main(String[] args) {
        Average calc = new Average();
        System.out.println("average: " + calc.avg(10, 20, 30));
    }
    double avg(int x, int y, int z){
        return ((x+y+z)/3);
    }
}
