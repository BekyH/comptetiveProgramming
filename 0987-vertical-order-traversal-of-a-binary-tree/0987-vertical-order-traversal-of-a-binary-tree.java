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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
         TreeMap<Integer,List<Integer>> treemap = new TreeMap<>();
         List<List<Integer>> result = new ArrayList<>();
         Deque<Node> deque = new ArrayDeque<>();
        deque.add(new Node(root,0));
        while(!deque.isEmpty()){
            int size = deque.size();
            HashMap<Integer,List<Integer>> map = new HashMap<>();
            for(int i=0;i<size;i++){
            Node node = deque.poll();
            int p_index = node.index;
             TreeNode p_node = node.treenode;
            if(map.containsKey(p_index)){
                map.get(p_index).add(p_node.val);
                Collections.sort(map.get(p_index));
            }
            else{
                List<Integer> lst = new ArrayList<>();
                lst.add(p_node.val);
                map.put(p_index,lst);
            }
            if(p_node.left!=null){
                deque.add(new Node(p_node.left,p_index-1));
            }
             if(p_node.right!=null){
                deque.add(new Node(p_node.right,p_index+1));
            }
            }
            
            for(Map.Entry<Integer,List<Integer>> e:map.entrySet()){
                List<Integer> list = new ArrayList();
                if(treemap.containsKey(e.getKey())){
                    list = treemap.get(e.getKey());
                }
                for(int x:e.getValue()){
                    list.add(x);
                }
                
                treemap.put(e.getKey(),list);
            }
           
            
            
        }
        for(Map.Entry<Integer,List<Integer>> e:treemap.entrySet()){
            result.add(e.getValue());
        }
        
       
      return result;  
    }
}

class Node {
    TreeNode treenode;
    int index;
    Node(TreeNode treenode,int index){
        this.treenode = treenode;
        this.index = index;
    }
}