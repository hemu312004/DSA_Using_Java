import java.util.HashSet;

public class recursive_keypad {
    // Array representing the characters corresponding to each digit on a keypad
    public static String keypad[] = {
        ".",    // 0
        "abc",  // 1
        "def",  // 2
        "ghi",  // 3
        "jkl",  // 4
        "mno",  // 5
        "pqrs", // 6
        "tu",   // 7
        "vwx",  // 8
        "yz"    // 9
    };

    // Method to print all possible combinations of characters for a given number string
    public static void printKeypadCombination(String number, int idx, String res) {
        // Base case: if we have considered all digits in the number string
        if (idx == number.length()) {
            // Print the current combination
            System.out.println(res);
            return;
        }

        // Get the characters corresponding to the current digit
        String chars = keypad[number.charAt(idx) - '0'];
        
        // Loop through each character and recurse for the next digit
        for (int i = 0; i < chars.length(); i++) {
            char curr = chars.charAt(i);
            // Recurse to form combinations including the current character
            printKeypadCombination(number, idx + 1, res + curr);
        }
    }

    public static void main(String args[]) {
        // Example number to generate combinations
        String number = "23";
        // Print all possible combinations for the given number
        printKeypadCombination(number, 0, "");
    }
}
