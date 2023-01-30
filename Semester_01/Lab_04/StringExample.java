//import java.util.*; not util methods
public class StringExample {
    public static void main(String[] args) {
    String name  = "Oscar";
    System.out.println("Length: " + name.length());
    System.out.println("Substring: " + name.substring(2,5));
    System.out.println("Concat: " + name.concat(" Healy"));
    System.out.println("Is it empty?... " + name.isEmpty());
    System.out.println("Equals: " + name.equals("Oscar"));
    }
}
