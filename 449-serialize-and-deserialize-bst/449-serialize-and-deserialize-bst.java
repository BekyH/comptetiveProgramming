/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        dfs(root,sb);
        return sb.toString();
        
    }
    public void dfs(TreeNode root,StringBuilder sb){
        if(root==null){
            return;
        }
        
        sb.append(root.val);
        sb.append(" ");
        dfs(root.left,sb);
        dfs(root.right,sb);
        
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.length()==0){
            return null;
        }
        String[] st  =data.split(" ");
        List<Integer> lst = new ArrayList<>();
        for(String str:st){
            lst.add(Integer.parseInt(str));
        }
        
        return buildTree(lst);
    }
    public TreeNode buildTree(List<Integer>list){
              if(list.size()==0){
                  return null;
              }
        
        TreeNode root = new TreeNode(list.get(0));
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        for(int i=1;i<list.size();i++){
            if(list.get(i)<root.val){
                left.add(list.get(i));
            }
        }
        for(int i=1;i<list.size();i++){
            if(list.get(i)>root.val){
                right.add(list.get(i));
            }
        }
        
        root.left = buildTree(left);
        root.right = buildTree(right);
        
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;