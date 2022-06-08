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
        double lower =Double.NEGATIVE_INFINITY;
        double upper =Double.POSITIVE_INFINITY;
        return dfs(root,lower,upper);
        
    }
    
    public boolean dfs(TreeNode root,double lower,double upper){
        if(root==null){
            return true;
        }
        if((double)root.val <=lower || (double)root.val>=upper){
             return false;
        }
        boolean left = dfs(root.left,lower,root.val);
        boolean right = dfs(root.right,root.val,upper);
        
        return left && right;
        
    }
}