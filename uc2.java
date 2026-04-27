// UC2: Display Hello with user's name using command-line argument

public class uc2{
    public static void main(String[] args) {

        // Check if name is provided
        if (args.length > 0) {
            String userName = args[0];

            String message = "Hello " + userName;

            System.out.println(message);
        } else {
            System.out.println("Please provide your name as a command-line argument.");
        }
    }
}