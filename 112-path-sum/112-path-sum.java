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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return dfs(root,0,targetSum);
    }
    public boolean dfs(TreeNode root,int curr_sum,int targetSum){
        if(root==null){
            return false;
        }
        if(is_leaf(root) && curr_sum + root.val==targetSum){
            return true;
        }
        boolean left = dfs(root.left,curr_sum+root.val,targetSum);
        boolean right = dfs(root.right,curr_sum + root.val,targetSum);
        
        return left || right;
        
    }
    public boolean is_leaf(TreeNode node){
        if(node.left==null && node.right==null){
            return true;
        }
        
        return false;
    }
}