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
    public int maxPathSum(TreeNode root) {
        int [] g_max = new int[1];
        g_max[0] = Integer.MIN_VALUE;
        dfs(root,g_max);
        return g_max[0];
        
    }
    public int dfs(TreeNode node,int [] g_max){
        if(node==null){
            return 0;
        }
        int left = 0;
        int right = 0;
        
        left = dfs(node.left,g_max);
        right =dfs(node.right,g_max);
        
        g_max[0]= Collections.max(Arrays.asList(g_max[0],node.val,left+node.val,right+node.val,left+right+node.val));
        return Collections.max(Arrays.asList(node.val,node.val+right,node.val+left));
        
        
    }
}