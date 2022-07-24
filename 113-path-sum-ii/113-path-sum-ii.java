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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(root,0,targetSum,new ArrayList<>(),result);
        return result;
        
    }
        
 public void dfs(TreeNode root,int curr_sum,int targetSum,List<Integer> list,List<List<Integer>> result){
        if(root==null){
            return;
        }
     List<Integer> temp = new ArrayList<>(list);
     List<Integer> temp2 = new ArrayList<>(list);
        if(is_leaf(root) && curr_sum + root.val==targetSum){
            
             temp.add(root.val);
            result.add(temp);
            return;
        }
         temp.add(root.val);
         temp2.add(root.val);
        dfs(root.left,curr_sum+root.val,targetSum,temp,result);
        dfs(root.right,curr_sum + root.val,targetSum,temp2,result);
        
        
        
    }
    public boolean is_leaf(TreeNode node){
        if(node.left==null && node.right==null){
            return true;
        }
        
        return false;
    }
}