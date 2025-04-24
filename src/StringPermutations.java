import java.util.ArrayList;
import java.util.List;

public class StringPermutations {

    // ===== ITERATIVE SOLUTION =====
    /**
     * Generates all permutations of a string using an iterative approach
     * @param input The string to permute (non-null, non-empty)
     * @return List of all unique permutations
     * @throws IllegalArgumentException if input is invalid
     */
    public static List<String> generateIterativePermutations(String input) {
        validateInput(input);

        List<String> currentPermutations = new ArrayList<>();
        currentPermutations.add(String.valueOf(input.charAt(0)));

        for (int i = 1; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            List<String> newPermutations = new ArrayList<>();

            for (String perm : currentPermutations) {
                for (int pos = 0; pos <= perm.length(); pos++) {
                    newPermutations.add(
                            perm.substring(0, pos) + currentChar + perm.substring(pos)
                    );
                }
            }
            currentPermutations = newPermutations;
        }

        return currentPermutations;
    }

    // ===== RECURSIVE SOLUTION =====
    /**
     * Generates permutations using recursion
     * @param input The string to permute
     * @return List of all unique permutations
     * @throws IllegalArgumentException if input is invalid
     */
    public static List<String> generateRecursivePermutations(String input) {
        validateInput(input);
        return recursiveHelper(input);
    }

    private static List<String> recursiveHelper(String input) {
        List<String> result = new ArrayList<>();

        if (input.length() == 1) {
            result.add(input);
            return result;
        }

        for (int i = 0; i < input.length(); i++) {
            for (String perm : recursiveHelper(
                    input.substring(0, i) + input.substring(i + 1)))
            {
                result.add(input.charAt(i) + perm);
            }
        }

        return result;
    }

    // ===== SHARED UTILITIES =====
    private static void validateInput(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        if (input.isEmpty()) {
            throw new IllegalArgumentException("Input cannot be empty");
        }
    }

    /**
     * Prints permutations with formatting
     * @param input The string to process
     * @param iterative true for iterative, false for recursive
     */
    public static void printPermutations(String input, boolean iterative) {
        try {
            List<String> permutations = iterative ?
                    generateIterativePermutations(input) :
                    generateRecursivePermutations(input);

            System.out.printf("%n%d permutations of '%s' (%s):%n",
                    permutations.size(), input, iterative ? "iterative" : "recursive");

            for (int i = 0; i < permutations.size(); i++) {
                System.out.printf("%3d. %s%n", i + 1, permutations.get(i));
            }
        } catch (IllegalArgumentException e) {
            System.err.println("Invalid input: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String testString = "abc";

        // Test both implementations
        printPermutations(testString, true);   // Iterative
        printPermutations(testString, false);  // Recursive

        // Error cases
        printPermutations("", true);
        printPermutations(null, false);
    }
}