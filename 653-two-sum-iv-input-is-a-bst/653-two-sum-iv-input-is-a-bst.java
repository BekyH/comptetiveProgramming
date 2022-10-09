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
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        
        dfs(root,list);
        int left = 0;
        int right = list.size()-1;
        while(left<right){
            int sum = list.get(left) + list.get(right);
            if(sum==k){
                return true;
            }
            else if(sum>k){
                right--;
            }
            else{
                left++;
            }
        }
        return false;
    }
    public void dfs(TreeNode root,List<Integer> list){
        if(root==null){
            return;
        }
        dfs(root.left,list);
        list.add(root.val);
        dfs(root.right,list);
    }
}