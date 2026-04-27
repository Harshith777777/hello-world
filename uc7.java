// UC7: Display greeting using String.join()

public class uc7 {
    public static void main(String[] args) {

        // Default case
        if (args.length == 0) {
            String defaultMessage = "Hello, World!";
            System.out.println(defaultMessage);
        } 
        else {
            // Join all names with ", "
            String joinedNames = String.join(", ", args);

            // Final message
            String message = "Hello, " + joinedNames + "!";
            System.out.println(message);
        }
    }
}
