package Day4;


// https://leetcode.com/problems/valid-palindrome/description/

// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

// Given a string s, return true if it is a palindrome, or false otherwise.

 

// Example 1:

// Input: s = "A man, a plan, a canal: Panama"
// Output: true
// Explanation: "amanaplanacanalpanama" is a palindrome.
// Example 2:

// Input: s = "race a car"
// Output: false
// Explanation: "raceacar" is not a palindrome.
// Example 3:

// Input: s = " "
// Output: true
// Explanation: s is an empty string "" after removing non-alphanumeric characters.
// Since an empty string reads the same forward and backward, it is a palindrome.
 

// Constraints:

// 1 <= s.length <= 2 * 105
// s consists only of printable ASCII characters.



class Solution {
    public boolean isPalindrome(String s) {
          int n= s.length();
        int i= 0;
        int j= n-1;
        while(i <= j){
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {//moving start until alphanumeric char found.
                i++;
            }
            
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {//moving end for same as above.
                j--;
            }
            int c1= Character.toLowerCase(s.charAt(i));
            int c2= Character.toLowerCase(s.charAt(j));
            if(c1 != c2){
                return false;
            }
            i++; j--;
        }
        return true;
        
    }
}