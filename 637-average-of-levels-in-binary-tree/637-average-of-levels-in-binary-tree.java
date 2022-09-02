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
    public List<Double> averageOfLevels(TreeNode root) {
        Deque<TreeNode> deque = new ArrayDeque<>();
        List<Double> result = new ArrayList<>();
        deque.add(root);
        while(!deque.isEmpty()){
            int size = deque.size();
            double sum = 0;
             
            for(int i=0;i<size;i++){
                TreeNode curr = deque.poll();
                sum = sum + curr.val;
                if(curr.left!=null){
                    deque.add(curr.left);
                }
                if(curr.right!=null){
                    deque.add(curr.right);
                }
            }
            result.add(sum/size);
        }
        
        return result;
    }
}