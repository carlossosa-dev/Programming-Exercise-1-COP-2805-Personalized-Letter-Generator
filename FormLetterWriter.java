public class FormLetterWriter {

    public static void main(String[] args) {
        // Display a salutation using only the last name
        displaySalutation("Kelly");

        // Show the rest of the business letter
        displayLetter();

        // Display a salutation using both first and last names
        displaySalutation("Christy", "Johnson");

        // Show the rest of the business letter again
        displayLetter();
    }

    // Displays a greeting that uses "Dear Mr. or Ms." followed by the last name
    public static void displaySalutation(String lastName) {
        System.out.println("Dear Mr. or Ms. " + lastName + ",");
    }

    // Displays a greeting that includes the first and last name, like "Dear John Doe"
    public static void displaySalutation(String firstName, String lastName) {
        System.out.println("Dear " + firstName + " " + lastName + ",");
    }

    // Prints the rest of the letter, which thanks the customer for their order
    public static void displayLetter() {
        System.out.println("   Thank you for your recent order.");
        System.out.println();
    }
}
