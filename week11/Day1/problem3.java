// 3.Binary Tree Right Side View

// Given the root of a binary tree, imagine yourself 
// standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.


import java.util.Arrays;

class problem3 {
    public List<Integer> rightSideView(TreeNode root) {
       List<Integer> ans= new ArrayList<>();
       rightView(root, 0, ans);
       return ans;
   }

   public void rightView(TreeNode root, int level, List<Integer> ans){
       if(root == null){
           return;
       }

       if(level == ans.size()){  
           ans.add(root.val); 
       }
       rightView(root.right, level+1, ans);  
       rightView(root.left, level+1, ans);    
   }
}