package Lab_22;
import java.util.Scanner;
public class InstanceMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        InstanceMethods instance = new InstanceMethods();
        
        instance.method1();       
        instance.method2();        
        instance.method3(45);
        instance.method4(12, 43);
        instance.method5(10, 20, 30);
        instance.method6("Oscar", "Healy");
        
        System.out.print("g. ");
        String fName = input.next();
        String lName = input.next();
        input.close();
        instance.method6(fName, lName);
        
        System.out.print("h. ");
        instance.method7("Oscar Healy", 27);

        System.out.print("i. ");
        System.out.println("Method8 returns a value of " + instance.method8() + " to me");

        System.out.print("j. ");
        System.out.println("returned name: " + instance.method9("Oscar", "Healy"));

        System.out.print("k. ");
        System.out.println("returned result: " + instance.method10(10, 20, 30));

    }

    void method1(){
        System.out.println("a. Hello from method1");
    }
    
    void method2(){
        System.out.println("b. Hello from method2");
    }
    
    void method3(int x){
        System.out.println("c. You passed me, method3, an integer value of " + x);
    }
    
    void method4(int x, int y){
        System.out.println("d. You passed me, method4, integer values of " + x + " and " + y);
    } 
    
    void method5(int x, int y, int z){
        System.out.println("e. You passed me, method5, integer values of " + x + ", " + y + " and " + z);
    }
    
    void method6(String fName, String lName){
        System.out.println("f. You passed me, method6, the name of " + fName + ", " + lName);
    }
    
    void method7(String name, int x){
        System.out.println("e. You passed me, method7, name " + name + "and the number " + x);
    }
    
    int method8(){
        int x = 1000;
        return x;
    }
    
    String method9(String fName, String lName){
        String fullName = fName + " " + lName;
        return fullName;
    }
    
    int method10(int x, int y, int z){
        int sum  = x+y+z;
        return sum;   
    }   
}