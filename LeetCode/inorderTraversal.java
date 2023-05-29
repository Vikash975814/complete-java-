class Solution {
     public List<Integer> inorderTraversal(TreeNode root) {
        traverse(root);
        return res;
    }
    ArrayList<Integer> res = new ArrayList<>();
    public void traverse(TreeNode root) {
        if (root == null) {
            return;
        }
        traverse(root.left);
        res.add(root.val);
        traverse(root.right);
    }
}
