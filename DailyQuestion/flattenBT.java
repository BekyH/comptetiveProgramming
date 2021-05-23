public class flattenBt {
    // using extra space
    public void flatten(TreeNode root) {

        List<TreeNode> list = new ArrayList<>();
        helper(root, list);
        for (int i = 1; i < list.size(); i++) {
            list.get(i - 1).left = null;
            list.get(i - 1).right = list.get(i);
        }

    }

    public void helper(TreeNode root, List<TreeNode> list) {
        if (root == null) {
            return;
        }
        list.add(root);
        helper(root.left, list);
        helper(root.right, list);

    }
}