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
        
        long lower = Long.MIN_VALUE;
        long higher = Long.MAX_VALUE;
        
        return dfs(root,lower,higher);
        
    }
    public boolean dfs(TreeNode root,long lower,long higher){
        if(root==null){
            return true;
        }
        if(root.val <= lower || root.val>=higher){
            return false;
        }
        boolean left = dfs(root.left,lower,root.val);
        boolean right = dfs(root.right,root.val,higher);
        
        return left && right;
    }
}