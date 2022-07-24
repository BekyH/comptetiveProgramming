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
    public int[] findMode(TreeNode root) {
        List<Integer> lst = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        dfs(root,map);
        int max=Collections.max(map.values());
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()==max){
                lst.add(e.getKey());
            }
        }
        int [] res = new int[lst.size()];
        int index = 0;
        while(index<lst.size()){
            res[index] = lst.get(index);
            index++;
        }
        
        return res;
    }
    
    public void dfs(TreeNode root,HashMap<Integer,Integer> map){
        if(root==null){
            return;
        }
        if(map.containsKey(root.val)){
            int freq = map.get(root.val);
            freq = freq + 1;
            map.put(root.val,freq);
        }
        else{
         map.put(root.val,1);
        }
        dfs(root.left,map);
        dfs(root.right,map);
    }
}