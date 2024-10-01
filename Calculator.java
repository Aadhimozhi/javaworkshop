import java.util.*;
public class Calculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("Error! Division by zero is not allowed.");
            return 0;
        }
    }

    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the value for A:");
        int num1=s.nextInt();
        System.out.print("Enter the value for B:");
        int num2=s.nextInt();
        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraction: " + subtract(num1, num2));
        System.out.println("Multiplication: " + multiply(num1, num2));
        System.out.println("Division: " + divide(num1, num2));
    }
}
