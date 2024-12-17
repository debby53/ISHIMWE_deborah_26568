/*Scenario:
Imagine you have an array of 5 students, and you're trying to access the 6th student's score (which doesn't exist).
This will trigger an ArrayIndexOutOfBoundsException.
 */
package REAL_WORLDSCENARIOS;
import java.util.Scanner;

public class ForArray {




        public static void main(String[] args) {
            int[] studentScores = {85, 90, 78, 92, 88}; // Array of 5 students' scores
            Scanner scanner = new Scanner(System.in);
            int index;

            while (true) {
                try {
                    // Prompt the user to input the index
                    System.out.print("Enter the index (0-4) to get the student's score: ");
                    index = scanner.nextInt();

                    // Trying to access the student score at the given index
                    System.out.println("Student's score at index " + index + ": " + studentScores[index]);
                    break;  // If the index is valid, exit the loop

                } catch (ArrayIndexOutOfBoundsException e) {
                    // If the index is out of bounds, catch the exception and ask the user to try again
                    System.out.println("Error: Invalid index. Please enter a number between 0 and 4.");
                } catch (Exception e) {
                    // Catch any other general exception, like invalid input
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.next();  // Consume the invalid input
                }
            }

            scanner.close();  // Close the scanner to prevent resource leak
        }
    }




/*Explanation:
In this scenario, the array has only 5 elements, so accessing index 5 will throw an ArrayIndexOutOfBoundsException,
 because arrays in Java are 0-indexed (i.e., valid indexes are 0 to 4).
 */
