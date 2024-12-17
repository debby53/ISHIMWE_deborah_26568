/*Scenario:
Imagine you're creating a method that calculates the square root of a number. If a user enters a negative number,
the method throws an IllegalArgumentException, because square roots of negative numbers are not allowed in real numbers.
 */
package REAL_WORLDSCENARIOS;
import java.util.Scanner;

public class IllegalArgumentsss {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double number;

            // Loop to keep asking for input until a valid number is entered
            while (true) {
                try {
                    // Prompting the user to enter a number
                    System.out.print("Enter a number to find its square root: ");
                    number = scanner.nextDouble();

                    // Trying to calculate the square root of the number
                    calculateSquareRoot(number);
                    break; // Exit the loop if no exception occurs

                } catch (IllegalArgumentException e) {
                    // Catching the exception if the number is negative
                    System.out.println("Error: Cannot calculate the square root of a negative number. Please try again.");
                } catch (Exception e) {
                    // Catching any other unexpected errors (like invalid input type)
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.nextLine(); // Clear the buffer to avoid infinite loop
                }
            }

            scanner.close();  // Close the scanner to prevent resource leak
        }

        // Method to calculate square root
        public static void calculateSquareRoot(double number) {
            if (number < 0) {
                throw new IllegalArgumentException("Negative numbers cannot have square roots.");
            }
            System.out.println("Square root: " + Math.sqrt(number));
        }
    }




