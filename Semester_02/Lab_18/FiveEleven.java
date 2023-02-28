package Semester_02.Lab_18;

public class FiveEleven {
    public static void main(String[] args) {
        int i = 5;
        String five = "", eleven = "",both = "";

        while (i <= 50) {   
            if (i % 5 ==0 ) { // if for sorting five and adding to string
                five += i;
                both += i;
                if (i!=50) {
                    five += " , ";       
                    both += " , ";
                }
            }else if (i % 11 == 0) { // if for sorting eleven and adding to string
                eleven += i;
                both += i + " , ";
                if (i!=50 && (i+11 < 50)) {
                // since 50 isnt divisible by 11, i+11 qualifies the last divisible number below 50 
                    eleven += " , ";                  
                }
            }     
            i++;
        }
        System.out.println("Divsible by 5:\n" + five);
        System.out.println("Divsible by 11:\n" + eleven);
        System.out.println("Divsible by either:\n" + both);
    }
}
