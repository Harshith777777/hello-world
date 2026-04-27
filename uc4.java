// UC4: Display Hello for multiple names or default "World"

public class uc4 {
    public static void main(String[] args) {

        // If no arguments, use default
        if (args.length == 0) {
            String defaultName = "World";
            String message = "Hello " + defaultName;
            System.out.println(message);
        } 
        else {
            // Loop through all names
            for (int i = 0; i < args.length; i++) {
                String userName = args[i];
                String message = "Hello " + userName;
                System.out.println(message);
            }
        }
    }
}