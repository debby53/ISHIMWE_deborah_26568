package REAL_WORLDSCENARIOS;
import java.util.Scanner;

public class ArithematicExceptionExample {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.print("Enter two numbers (dividend and divisor): ");
                int num1 = scanner.nextInt();
                int num2 = scanner.nextInt();
                try {
                    int result = num1 / num2;
                    System.out.println("Result: " + result);
                    break; // Exit the loop if division is successful
                } catch (ArithmeticException e) {
                    System.out.println("Cannot divide by zero. Please try again.");
                }
            }
            scanner.close();
        }
    }


