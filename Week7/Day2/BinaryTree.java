// A path in a binary tree is a sequence of nodes where each pair of adjacent nodes in the sequence has an edge connecting them. A node can only appear in the sequence at most once. Note that the path does not need to pass through the root.

// The path sum of a path is the sum of the node's values in the path.

// Given the root of a binary tree, return the maximum path sum of any non-empty path.

 

// Example 1:


// Input: root = [1,2,3]
// Output: 6
// Explanation: The optimal path is 2 -> 1 -> 3 with a path sum of 2 + 1 + 3 = 6.
// Example 2:


// Input: root = [-10,9,20,null,null,15,7]
// Output: 42
// Explanation: The optimal path is 15 -> 20 -> 7 with a path sum of 15 + 20 + 7 = 42.
 

// Constraints:

// The number of nodes in the tree is in the range [1, 3 * 104].
// -1000 <= Node.val <= 1000

import java.util.ArrayList;



class Solution {
    private int maxSum; // global variable to store the maximum path sum

    // Helper function to recursively calculate the maximum path sum starting from the current node
    private int maxPathSumHelper(TreeNode root) {
        if (root == null) {
            return 0;
        }

        // Calculate maximum path sum for the left and right subtrees
        int leftSum = Math.max(0, maxPathSumHelper(root.left)); // max path sum starting from left child
        int rightSum = Math.max(0, maxPathSumHelper(root.right)); // max path sum starting from right child

        // Update the global maxSum by considering the path through the current node
        maxSum = Math.max(maxSum, leftSum + rightSum + root.val);

        // Return the maximum path sum starting from the current node (either left or right subtree + current node value)
        return Math.max(leftSum, rightSum) + root.val;
    }

    // Main function to find the maximum path sum in the binary tree
    public int maxPathSum(TreeNode root) {
        maxSum = Integer.MIN_VALUE; // Initialize maxSum to the smallest possible integer
        maxPathSumHelper(root); // Call helper function to recursively calculate maximum path sum
        return maxSum;
    }
}