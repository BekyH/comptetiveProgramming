import java.util.*;
public class BT_maximum_path_sum{
public int maxPathSum(TreeNode root) {
    List<Integer> pair = helper(root);
    return pair.get(0);
}

public List<Integer> helper(TreeNode root){
    List<Integer> leftpair;
    int path=0;
    List<Integer> rightpair;
    List<Integer> pair;
    int max = Integer.MIN_VALUE;
    if(isLeaf(root)){
         pair = new ArrayList<>(Arrays.asList(root.val,root.val));
        return pair;
    }
    else if(root.left!=null && root.right!=null){
        
        leftpair =helper(root.left);
        //rightpair = new Pair<>();
        rightpair=helper(root.right);
    max = Collections.max(Arrays.asList(leftpair.get(0),max,root.val + leftpair.get(1),root.val,rightpair.get(0),
    root.val + rightpair.get(1),leftpair.get(1) + rightpair.get(1) + root.val));
    
     path = Collections.max(Arrays.asList(root.val,root.val + leftpair.get(1),root.val + rightpair.get(1)));
    }
    else if(root.right!=null){
        //rightpair = new Pair<>();
        rightpair = helper(root.right);
         max = Collections.max(Arrays.asList(root.val,rightpair.get(0),root.val + rightpair.get(1)));
       path = Math.max(root.val,rightpair.get(1) + root.val);                        
    }
    else{
        //leftpair = new Pair<>();
        leftpair = helper(root.left);
       max = Collections.max(Arrays.asList(root.val,leftpair.get(0),root.val + leftpair.get(1)));
       path = Math.max(root.val,leftpair.get(1) + root.val);                         
    }                           
    pair = Arrays.asList(max,path);
        return pair;

}
public boolean isLeaf(TreeNode node){
    if(node.left==null && node.right==null){
        return true;
    }
    return false;
}
}
}
