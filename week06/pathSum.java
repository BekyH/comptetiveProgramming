import java.util.ArrayList;
import java.util.List;

public class pathSum {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        boolean[] isPath = new boolean[1];
        helper(root, 0, targetSum, isPath);
        return isPath[0];
    }

    public boolean[] helper(TreeNode root, int sum, int targetSum, boolean[] isPath) {
        if (root == null) {
            return isPath;
        }
        if (isLeafNode(root)) {
            sum = sum + root.val;

            if (sum == targetSum) {
                isPath[0] = true;
            }
        }

        helper(root.left, sum + root.val, targetSum, isPath);
        helper(root.right, sum + root.val, targetSum, isPath);
        return isPath;

    }

    public boolean isLeafNode(TreeNode node) {

        if (node != null && node.left == null && node.right == null) {
            return true;
        }
        return false;
    }
}
