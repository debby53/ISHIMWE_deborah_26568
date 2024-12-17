/*Scenario:
Imagine you're trying to send a welcome email to a user, but the user's email address is not provided or initialized
(it's null), and the program tries to access the email field to send the email. Since the email field is null,
the program will throw a NullPointerException.
 */


package REAL_WORLDSCENARIOS;

public class ForNull {

        public static void main(String[] args) {
            // Simulating a user with no email
            User user = new User(); // User object with email field not set (null)

            try {
                // Trying to send email, but the email field is null
                sendWelcomeEmail(user.getEmail());
            } catch (NullPointerException e) {
                System.out.println("Error: User's email is not provided.");
            }
        }

        public static void sendWelcomeEmail(String email) {
            // Attempting to access a null email
            System.out.println("Sending welcome email to: " + email);
        }
    }

    class User {
        private String email; // Email is not initialized, so it is null

        public String getEmail() {
            return email;
        }
    }
    /*Explanation:
In this scenario, the email field is null, and when the sendWelcomeEmail() method tries to access it,
a NullPointerException occurs because the program is trying to use a null reference.
     */



