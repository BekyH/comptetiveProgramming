/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
          return dfs(root,Double.POSITIVE_INFINITY,Double.NEGATIVE_INFINITY);
    }
    
    public boolean dfs(TreeNode root, double high, double low){
          if(root==null){
              return true;
          }
          if((double)root.val>= high || (double)root.val<=low){
              return false;
          }
          boolean left = dfs(root.left,(double)root.val,low);
          boolean right = dfs(root.right,high,(double)root.val);
        
        return left && right;
    }
}