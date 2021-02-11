import java.util.ArrayList;
import java.util.List;

public class bootomLeftTree {
    public int findBottomLeftValue(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        res = findblvhelper(root, 0);
        return res.get(0);

    }

    public List<Integer> findblvhelper(TreeNode root, int level) {
        if (root == null) {
            return null;
        }
        if (root.left == null && root.right == null) {
            List<Integer> res = new ArrayList<>();

            res.add(root.val);
            res.add(level);
            return res;
        }
        if (root.left != null && root.right == null) {
            List<Integer> left = new ArrayList<>();
            left = findblvhelper(root.left, level + 1);
            return left;
        }
        if (root.right != null && root.left == null) {
            List<Integer> right = new ArrayList<>();
            right = findblvhelper(root.right, level + 1);
            return right;

        }
        List<Integer> left = new ArrayList<>();
        left = findblvhelper(root.left, level + 1);
        List<Integer> right = new ArrayList<>();
        right = findblvhelper(root.right, level + 1);

        if (left.get(1) >= right.get(1)) {
            return left;

        } else {
            return right;
        }


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

