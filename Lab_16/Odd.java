public class Odd { 
    public static void main(String[] args) { 
        int sum=0;
        for(int i = 1; i <= 15; i++){ 
            if (i%2 != 0) {
                 sum+=i; 
                }
            } 
            System.out.println("Sum total of odd numbers from 1 to 15 is: " + sum);
        }
    }