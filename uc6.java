// UC6: Display greeting using enhanced for loop and substring

public class uc6 {
    public static void main(String[] args) {

        // Default case
        if (args.length == 0) {
            String defaultMessage = "Hello, World!";
            System.out.println(defaultMessage);
        } 
        else {
            // Build names string with delimiter
            String names = "";

            for (String userName : args) {
                names = names + userName + ", ";
            }

            // Remove trailing ", " using substring
            names = names.substring(0, names.length() - 2);

            // Final message
            String message = "Hello, " + names + "!";
            System.out.println(message);
        }
    }
}