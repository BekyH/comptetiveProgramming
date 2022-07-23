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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        
        return dfs(root,subRoot);
        
    }
    public boolean dfs(TreeNode root,TreeNode subRoot){
         if(root==null){
             return false;
         }
        if(same(root,subRoot)){
            return true;
        }
        
        return dfs(root.left,subRoot) || dfs(root.right,subRoot);
        
    }
    public boolean same(TreeNode p,TreeNode q){
        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null){
            return false;
        }
        if(p.val!=q.val){
            return false;
        }
        
        return same(p.left,q.left) && same(p.right,q.right);
    }
}