public class recursivefirstlast {
    // Static variables to store the first and last occurrence indices
    public static int first = -1;
    public static int last = -1;

    // Recursive method to find the first and last occurrence of a character in a string
    public static void getIndices(String str, char el, int idx) {
        // Base case: if the current index reaches the length of the string, stop recursion
        if (idx == str.length()) {
            return;
        }
        // Check if the character at the current index matches the target character
        if (str.charAt(idx) == el) {
            // If 'first' has not been set, set it to the current index
            if (first == -1) {
                first = idx;
            } else {
                // Otherwise, set 'last' to the current index
                last = idx;
            }
        }
        // Recursive call to check the next character in the string
        getIndices(str, el, idx + 1);
    }

    // Main method: the entry point of the program
    public static void main(String args[]) {
        // Initialize the string to search and the character to find
        String str = "tabcdfghijakkk";
        char el = 'a';
        
        // Call the recursive method starting at index 0
        getIndices(str, el, 0);
        
        // Print the results: first and last occurrence indices
        System.out.println("First occurrence: " + first);
        System.out.println("Last occurrence: " + last);
    }
}
