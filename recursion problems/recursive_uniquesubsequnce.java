import java.util.HashSet;

public class recursive_uniquesubsequnce {
    // Method to print all unique subsequences of a given string
    public static void printSubseq(String str, int idx, String newString, HashSet<String> allSubseq) {
        // Base case: if we have considered all characters of the string
        if (idx == str.length()) {
            // If the resulting subsequence is already in the set, return
            if (allSubseq.contains(newString)) {
                return;
            }
            // Otherwise, add the subsequence to the set and print it
            allSubseq.add(newString);
            System.out.println(newString);
            return;
        }
        // Recursive case 1: include the current character in the subsequence
        printSubseq(str, idx + 1, newString + str.charAt(idx), allSubseq);
        // Recursive case 2: do not include the current character in the subsequence
        printSubseq(str, idx + 1, newString, allSubseq);
    }

    public static void main(String args[]) {
        // Example strings to find subsequences
        //String str1 = "abc";
        String str2 = "aaa";
        
        // HashSet to store all unique subsequences
        HashSet<String> allSubseq = new HashSet<>();
        
        // Print all unique subsequences of str2
        printSubseq(str2, 0, "", allSubseq);
    }
}
