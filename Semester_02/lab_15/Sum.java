public class Sum {

    public static void main(String[] args) {
        int count = 0, totalA = 0, totalB = 0, totalC=0;
        while (count <= 100) {
            if (count % 2 == 0) {
                totalA+=count;
            } else {
                totalB+=count;
            }
            totalC +=count;
            count++;
        }
        System.out.println("Sum Total of even numbers 1-100: " + totalA);
        System.out.println("Sum Total of odd numbers 1-100:  " + totalB);
        System.out.println("Sum Total of all numbers 1-100:  " + totalC);
    }
}
