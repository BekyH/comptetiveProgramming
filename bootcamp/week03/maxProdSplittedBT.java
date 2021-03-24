package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class maxProdSplittedBT {
    public int maxProduct(TreeNode root) {
        long total_sum = 0;
        long max_prod = 0;
        HashMap<TreeNode,Long> hashmap = new HashMap<>();
        ArrayList<TreeNode> list = new ArrayList<>();
        node_collector(root,list);
        total_sum = dfs(root,total_sum,hashmap);
        for(int i = 1;i<list.size();i++){
            long sum_of_nodes = dfs(list.get(i),total_sum,hashmap);
            long diff = total_sum-sum_of_nodes;
            max_prod = Math.max(max_prod,(sum_of_nodes * diff));
        }
        max_prod = max_prod %  (long)(Math.pow(10, 9) + 7);
        return (int)max_prod;
    }
    public void node_collector(TreeNode root,ArrayList<TreeNode> list){
        if(root==null){
            return;
        }
        list.add(root);
        node_collector(root.left,list);
        node_collector(root.right,list);


    }
    public long dfs(TreeNode root,long total_sum,HashMap<TreeNode,Long> hashmap ){
        if(root==null){
            return 0;
        }
        if(hashmap.containsKey(root)){
            return hashmap.get(root);
        }
        long left = dfs(root.left,total_sum,hashmap);
        long right = dfs(root.right,total_sum,hashmap);

        total_sum = total_sum + root.val + left + right;
        hashmap.put(root,total_sum);
        return hashmap.get(root);
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
