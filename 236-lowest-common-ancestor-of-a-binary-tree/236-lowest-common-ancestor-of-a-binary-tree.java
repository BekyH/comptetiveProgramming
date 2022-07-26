/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> p_path = new ArrayList<>();
        List<TreeNode> q_path = new ArrayList<>();
        TreeNode ans = null;
        dfs(root,p_path,p);
        dfs(root,q_path,q);
        int n = Math.min(p_path.size(),q_path.size());
        
        for(int i=0;i<n;i++){
            if(p_path.get(i)==q_path.get(i)){
                ans = p_path.get(i);
                
            }
        }
        
        return ans;
    }
    public boolean dfs(TreeNode root,List<TreeNode> list,TreeNode p){
        if(root==null){
            return false;
        }
        if(root==p){
            list.add(root);
            return true;
        }
        list.add(root);
        if(dfs(root.left,list,p) || dfs(root.right,list,p)){
            return true;
        }
        
       
        list.remove(list.size()-1);
        return false;
        
    }
    
}