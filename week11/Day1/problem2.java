// 2. Validate Binary Search Tree

// Given the root of a binary tree, determine if it is a valid binary search tree (BST).

// A valid BST is defined as follows:

// The left 
// subtree
//  of a node contains only nodes with keys less than the node's key.
// The right subtree of a node contains only nodes with keys greater than the node's key.
// Both the left and right subtrees must also be binary search trees.


class Problem12 {
    long Prev = Long.MIN_VALUE;

    void inorder(TreeNode a, boolean[] Is) {
        if (a == null){
            return;
        }
        inorder(a.left, Is);
        if (a.val <= Prev){
            Is[0] = false;
        }
        Prev = a.val;
        inorder(a.right, Is);
    }

    public boolean isValidBST(TreeNode a) {
        boolean[] Is = {true};
        inorder(a, Is);
        return Is[0];
    }
}
