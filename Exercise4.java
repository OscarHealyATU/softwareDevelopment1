import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month, year;

        System.out.print("Enter a number for month: ");
        month = input.nextInt();
        
        System.out.print("Enter a number for year: ");
        year = input.nextInt();
        input.close();

        switch (month) {
            case 1:
                System.out.println("Number of days in January is 31");
                break;

            case 2:
                if (year % 4 == 0) {
                System.out.println("29");
            }else{
                System.out.println("Number of days in February is 28");
            }
                break;

                case 3:
                System.out.println("Number of days in March is 31");
                break;

            case 4:
                System.out.println("Number of days in April is 30");
                break;

            case 5:
                System.out.println("Number of days in May is 31");
                break;

            case 6:
                System.out.println("Number of days in June is 30");
                break;
                
            case 7:
                System.out.println("Number of days in July is 31");
                break;

            case 8:
                System.out.println("Number of days in August is 31");
                break;

            case 9:
                System.out.println("Number of days in September is 30");
                break;

            case 10:
                System.out.println("Number of days in October is 31");
                break;
                
            case 11:
                System.out.println("Number of days in November is 30");
                break;

            case 12:
                System.out.println("Number of days in December is 31");
                break;
        
            default:
            System.out.println("invalid month");
                break;
        }
    }
}
