/*Imagine a user is inputting a phone number as a string, but accidentally enters some non-numeric characters.
When the program attempts to convert the string into an integer, a NumberFormatException is thrown.
 */
package REAL_WORLDSCENARIOS;
import java.util.Scanner;
public class NumberFormattt {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);  // Create a Scanner object to get input
            String input;  // Variable to store the user's input
            int phoneNumber;  // Variable to store the parsed phone number

            while (true) {
                System.out.print("Please enter a valid phone number: ");
                input = scanner.nextLine();  // Get the input from the user

                try {
                    // Trying to convert the string to an integer
                    phoneNumber = Integer.parseInt(input);
                    System.out.println("Phone number: " + phoneNumber);  // Print the valid phone number
                    break;  // Exit the loop if the input is valid
                } catch (NumberFormatException e) {
                    // Catch the exception if the format is incorrect
                    System.out.println("Error: Invalid number format. Please enter a valid number.");
                }
            }

            scanner.close();  // Close the scanner
        }
    }



