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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        dfs(root,ans);
        
        return ans;
    }
    
    public void dfs(TreeNode node,List<Integer> result){
         if(node==null){
             return;
         }
        dfs(node.left,result);
        result.add(node.val);
        dfs(node.right,result);
    }
}