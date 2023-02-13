import java.util.Scanner;

public class Sales {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        double teamSales = 0, teamCom= 0;

        for (int i = 1; i < 4; i++) {

            double sales = 0, commision = 0;
            double  item1 = 239.99, 
                    item2 = 129.75, 
                    item3 = 99.96, 
                    item4 = 350.56;

            System.out.print("Enter number sold of item 1 ");
            item1 *= input.nextDouble();
            System.out.print("Enter number sold of item 2 ");
            item2 *= input.nextDouble();
            System.out.print("Enter number sold of item 3 ");
            item3 *= input.nextDouble();
            System.out.print("Enter number sold of item 4 ");
            item4 *= input.nextDouble();
            System.out.println(" ");

            sales = item1 + item2 + item3 + item4;
            teamSales += sales;
            commision  = (sales*0.09) + 200;
            teamCom += commision;

            System.out.println("Total sales : " + Math.round(sales) + "\nComission: €" + Math.round(commision) + "\n");
        }
        input.close();
        System.out.println("Team Sales €" + Math.round(teamSales));
        System.out.println("Team Commision €" + Math.round(teamCom));


        

    }
}
