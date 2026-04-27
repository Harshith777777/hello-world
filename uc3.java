// UC3: Display Hello with user's name or default "World"

public class uc3{
    public static void main(String[] args) {

        // Default value
        String userName = "World";

        // If argument is passed, override default
        if (args.length > 0) {
            userName = args[0];
        }

        // Prepare message
        String message = "Hello " + userName;

        // Display output
        System.out.println(message);
    }
}