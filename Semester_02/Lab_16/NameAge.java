/**
 * NameAge
 */
public class NameAge {

    public static void main(String[] args) {
        int age = 8, count = 1;
        String name = "John smith junior";

        while (count <= age) {
            System.out.println(count + ". " + name);
            count++;
        }
    }
}