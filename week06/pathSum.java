import java.util.ArrayList;
import java.util.List;

public class pathSum {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        List<Integer> arr = new ArrayList<>();
        hasPathSumhelper(root,targetSum,0,arr);
        for(int x:arr){
            if(targetSum==x){
                return true;
            }
        }
        return false;

    }

    public void hasPathSumhelper(TreeNode root, int targetSum, int sum, List<Integer> result){
        if(root.left==null && root.right==null){
            sum = sum + root.val;
            result.add(sum);

        }
        if(root.left!=null){
            hasPathSumhelper(root.left,targetSum, sum + root.val,result);
        }
        if(root.right!=null){
            hasPathSumhelper(root.right,targetSum, sum + root.val,result);
        }



    }


}
