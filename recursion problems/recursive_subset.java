import java.util.ArrayList;

public class recursive_subset  {

    public static void printsubsets(ArrayList<Integer> subset) {
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }

    public static void subsets(int n, ArrayList<Integer> subset) {
        if (n == 0) {
            printsubsets(subset);
            return;
        }

        // Add current element
        subset.add(n);
        subsets(n - 1, subset);

        // Backtrack and do not add current element
        subset.remove(subset.size() - 1);
        subsets(n - 1, subset);
    }

    public static void main(String[] args) {
        int n = 3; // Example input
        ArrayList<Integer> subset = new ArrayList<>();
        subsets(n, subset);
    }
}
