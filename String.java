public class StringExample {
    public static void main(String[] args) {
        // Declare and initialize strings
        String firstName = "Smruti";
        String lastName = "Sahoo";

        // Concatenation
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);

        // Length of string
        System.out.println("Length of Full Name: " + fullName.length());

        // Convert to uppercase
        System.out.println("Uppercase: " + fullName.toUpperCase());

        // Convert to lowercase
        System.out.println("Lowercase: " + fullName.toLowerCase());

        // Check if two strings are equal
        String anotherName = "Smruti Sahoo";
        boolean isEqual = fullName.equals(anotherName);
        System.out.println("Is equal to 'Smruti Sahoo'? " + isEqual);

        // Substring
        String sub = fullName.substring(0, 6);
        System.out.println("Substring (0 to 6): " + sub);

        // Character at a specific index
        System.out.println("Character at index 2: " + fullName.charAt(2));
    }
}
