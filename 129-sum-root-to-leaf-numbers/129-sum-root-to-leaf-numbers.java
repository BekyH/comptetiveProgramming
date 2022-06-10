/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TriieeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int sumNumbers(TreeNode root) {
           int[] sum = new int[1];
           StringBuilder sb = new StringBuilder();
           helper(root,sb,sum);
        
           return sum[0];
        
    }
    public void helper(TreeNode root,StringBuilder sb,int[] sum){
        if(root==null){
            return;
        }
        sb.append(root.val);
        if(isLeaf(root)){
            sum[0] = sum[0] + Integer.parseInt(sb.toString());
            
        }
        helper(root.left,sb,sum);
        helper(root.right,sb,sum);
        
        sb.deleteCharAt(sb.length()-1);
    }
    
    public boolean isLeaf(TreeNode node){
       if(node.left==null && node.right==null){
           return true;
       }   
        return false;
    }
    
}