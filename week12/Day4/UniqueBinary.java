// https://leetcode.com/problems/unique-binary-search-trees/description/

// Given an integer n, return the number of structurally unique BST's (binary search trees) which has exactly n nodes of unique values from 1 to n.

 

// Example 1:


// Input: n = 3
// Output: 5
// Example 2:

// Input: n = 1
// Output: 1
 

// Constraints:

// 1 <= n <= 19

import java.math.BigInteger;
//for large input as 19,38 we use BigInteger..........
class Solution {
    public int numTrees(int n) {
        BigInteger n1 = factorial(BigInteger.valueOf(2 * n));
        System.out.println(n1); // For debugging purposes
        BigInteger n2 = factorial(BigInteger.valueOf(n + 1));
        BigInteger n3 = factorial(BigInteger.valueOf(n));
        
        BigInteger result = n1.divide(n2.multiply(n3));
        
        return result.intValue();
    }
    
    private BigInteger factorial(BigInteger n) {
        if (n.equals(BigInteger.ZERO) || n.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        }
        return n.multiply(factorial(n.subtract(BigInteger.ONE)));
    }
}