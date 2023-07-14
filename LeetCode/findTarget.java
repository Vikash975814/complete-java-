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
         private void inorderTraversal(TreeNode root,List<Integer> list)  {
        if(root==null) 
            return;
        inorderTraversal(root.left,list);
        list.add(root.val);
        inorderTraversal(root.right,list);
    }
    public boolean findTarget(TreeNode root, int k) {
        if(root==null)
        return false;
        List<Integer> list=new ArrayList<>();
        inorderTraversal(root,list);
        int i=0,j=list.size()-1;
        while(i<j)
        {
    int sum=list.get(i)+list.get(j);
       if(sum==k)
      return true;
       else if(sum>k)
           j--;
           else
           i++;
        }
        return false;
        }
}
