package Recursion;

public class UniqueSubsequence {
    public static void printSubsequences(String str, int index,String current){
        if (index == str.length()) {
            if (!current.isEmpty()) {
                System.out.println(current); // Print the current subsequence if it's not empty
            }
            return;
        }

        // Include the current character
        printSubsequences(str, index + 1, current + str.charAt(index));

        // Skip duplicates
        while (index < str.length() - 1 && str.charAt(index) == str.charAt(index + 1)) {
            index++;
        }

        // Exclude the current character
        printSubsequences(str, index + 1, current);

    }
    public static void main(String[] args) {
        String str = "abb";
        String ans = "";
        printSubsequences(str,0,ans);
    }
}
