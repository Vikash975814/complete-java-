class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        traverse(root);
        return list;
    }
    ArrayList<Integer> list=new ArrayList<>();
    public void traverse(TreeNode root){
        if(root==null)
            return;
        traverse(root.left);
        traverse(root.right);
        list.add(root.val);
}
}
