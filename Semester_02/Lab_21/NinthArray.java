package Lab_21;

public class NinthArray {
 public static void main(String[] args) {
    int[] first =  {1,2,3,4};
    int[] second = {1,2,3,4};
    int[] third = {1,2,67,4};
    boolean checker1 = false, checker2 = false;

    for (int i = 0; i < first.length; i++) {
        if (first[i] != second[i]) checker1 = true;
        if (first[i] != third[i]) checker2 = true;
    }
    if (checker2 && checker1) {
        
    }
    if (checker1) System.out.println("first and second arrays are not equal");
    else System.out.println("first and second arrays are equal");
    if (checker2) System.out.println("first and third arrays are not equal");
    else System.out.println("first and third arrays are equal");
 }   
}
