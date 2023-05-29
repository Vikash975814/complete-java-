class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
     traverse(root);
        return res;
    }
    ArrayList<Integer> res=new ArrayList<>();
    public void traverse(TreeNode root){
        if (root==null){
            return;
}
        res.add(root.val);
        traverse(root.left);
        traverse(root.right);
}
}
