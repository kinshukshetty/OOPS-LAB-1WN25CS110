import java.util.Scanner;

public class EmailProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student email address: ");
        String email = scanner.nextLine();
        email = email.trim();
        System.out.println("\n--- Email String Operations Results ---");
        System.out.println("Trimmed Email: " + email);

        int length = email.length();
        System.out.println("1. Length of email address: " + length);

        int atIndex = email.indexOf('@');

        if (atIndex != -1) {
            String username = email.substring(0, atIndex);
            System.out.println("2. Username: " + username);

            String domain = email.substring(atIndex + 1);
            System.out.println("3. Domain name: " + domain);
            
            boolean isValidDomain = domain.equals("bmsce.ac.in");
            System.out.println("Belongs to institution BMS (bmsce.ac.in): " + isValidDomain);
        } else {
            System.out.println("Invalid email format: '@' symbol missing.");
        }

        String lowerEmail = email.toLowerCase();
        System.out.println("4. Lowercase email: " + lowerEmail);

        System.out.print("Enter a prefix to check: ");
        String prefix = scanner.nextLine();
        boolean startsWithPrefix = email.startsWith(prefix);
        System.out.println("5. Starts with '" + prefix + "': " + startsWithPrefix);

        boolean endsWithDomain = email.endsWith("bmsce.ac.in");
        System.out.println("6. Ends with 'bmsce.ac.in': " + endsWithDomain);

        String updatedEmail = email.replace("bmsce.ac.in", "cse.bmsce.ac.in");
        System.out.println("7. Updated email (domain replaced): " + updatedEmail);

        System.out.print("Enter a character or sequence to check: ");
        String sequence = scanner.nextLine();
        boolean containsSequence = email.contains(sequence);
        System.out.println("8. Contains '" + sequence + "': " + containsSequence);

        System.out.print("Enter another email address to compare: ");
        String secondEmail = scanner.nextLine();
        boolean areEqual = email.equalsIgnoreCase(secondEmail.trim());
        System.out.println("10. Are the two emails identical (ignoring case)? " + areEqual);

        scanner.close();
    }
}