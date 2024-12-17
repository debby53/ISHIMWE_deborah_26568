/*Scenario:
Imagine you're working with a list of objects, and you're trying to cast a generic Object to a String,
but the object is actually an Integer. This will cause a ClassCastException.
 */
package REAL_WORLDSCENARIOS;
import java.util.Scanner;

public class ForClassCast {

        public static void main(String[] args) {
            Object obj = 42; // obj is an Integer, not a String

            try {
                // Trying to cast Integer to String
                String str = (String) obj;
            } catch (ClassCastException e) {
                System.out.println("Error: Cannot cast Integer to String.");
            }
        }
    }






