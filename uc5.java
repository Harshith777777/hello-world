// UC5: Display greeting using enhanced for loop (for-each)

public class uc5 {
    public static void main(String[] args) {

        // If no arguments → default message
        if (args.length == 0) {
            String defaultMessage = "Hello, World!";
            System.out.println(defaultMessage);
        } 
        else {
            // Enhanced for loop to iterate names
            for (String userName : args) {
                String message = "Hello, " + userName + "!";
                System.out.println(message);
            }
        }
    }
}