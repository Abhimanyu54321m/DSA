package company.Java;

public class WildcardMatching {
    public static boolean isMatch(String text, String pattern) {
        int textLen = text.length();
        int patternLen = pattern.length();

        // DP Table where dp[i][j] is true if pattern[0..j-1] matches text[0..i-1]
        boolean[][] dp = new boolean[textLen + 1][patternLen + 1];

        // Base case: empty pattern matches empty text
        dp[0][0] = true;

        // Handle patterns with '*' at the beginning
        for (int j = 1; j < patternLen+1; j++) {
            if (pattern.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 1];
            }
        }

        // Fill the DP table
        for (int i = 1; i < textLen+1; i++) {
            for (int j = 1; j < patternLen+1; j++) {

                if (pattern.charAt(j - 1) == '?' || text.charAt(i - 1) == pattern.charAt(j - 1)) {
                    // Match single character
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (pattern.charAt(j - 1) == '*') {
                    // Match zero or more characters
                    dp[i][j] = dp[i - 1][j] || dp[i][j - 1];
                } else {
                    dp[i][j] = false;
                }
            }
        }

        // Return 1 if match, 0 otherwise
        return dp[textLen][patternLen];
    }

    public static void main(String[] args) {
        // Test cases
        String text = "abcdef";
        String pattern = "a?c*";
        System.out.println(isMatch(text,pattern)); // Output: 1 if match, 0 otherwise
    }
}