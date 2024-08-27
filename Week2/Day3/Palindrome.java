// https://leetcode.com/problems/palindromic-substrings/


// Given a string s, return the number of palindromic substrings in it.

// A string is a palindrome when it reads the same backward as forward.

// A substring is a contiguous sequence of characters within the string.

 

// Example 1:

// Input: s = "abc"
// Output: 3
// Explanation: Three palindromic strings: "a", "b", "c".
// Example 2:

// Input: s = "aaa"
// Output: 6
// Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
 

// Constraints:

// 1 <= s.length <= 1000
// s consists of lowercase English letters.







class Solution {
    public int countSubstrings(String s) {
       int count = 0;

        // Initialize a lookup table of dimensions len(s) * len(s)
        boolean[][] dp = new boolean[s.length()][s.length()];

        // Base case: A string with one letter is always a palindrome
        for (int i = 0; i < s.length(); i++) {
            dp[i][i] = true;
            count++;
        }

        // Base case: Substrings of two letters
        for (int i = 0; i < s.length() - 1; i++) {
            dp[i][i + 1] = (s.charAt(i) == s.charAt(i + 1));
            count += dp[i][i + 1] ? 1 : 0;
        }

        // Substrings of lengths greater than 2
        for (int length = 3; length <= s.length(); length++) {
            for (int i = 0, j = length - 1; j < s.length(); i++, j++) {
                dp[i][j] = dp[i + 1][j - 1] && (s.charAt(i) == s.charAt(j));
                count += dp[i][j] ? 1 : 0;
            }
        }

        return count;
      
    }
}
