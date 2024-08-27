// https://leetcode.com/problems/longest-palindromic-subsequence/description/

// Given a string s, find the longest palindromic subsequence's length in s.

// A subsequence is a sequence that can be derived from another sequence by deleting some or no elements without changing the order of the remaining elements.

 

// Example 1:

// Input: s = "bbbab"
// Output: 4
// Explanation: One possible longest palindromic subsequence is "bbbb".
// Example 2:

// Input: s = "cbbd"
// Output: 2
// Explanation: One possible longest palindromic subsequence is "bb".
 

// Constraints:

// 1 <= s.length <= 1000
// s consists only of lowercase English letters.

class Solution {
    public int longestPalindromeSubseq(String s) {
        String p = new StringBuilder(s).reverse().toString();
        int m = s.length();
        int dp[] = new int[m+1];
        int de[] = new int[m+1];
        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(s.charAt(i-1) == p.charAt(j-1))
                {
                    dp[j] = 1 + de[j-1];
                }
                else
                {
                    dp[j] = Math.max(dp[j-1] , de[j]);
                }
            }
            for(int j=1;j<=m;j++)
            {
                de[j] = dp[j];
            }
        }
        return de[m];

        
    }
}
