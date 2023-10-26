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
    List<List<Integer>> l1=new ArrayList<>();
    void help(List<Integer> list,TreeNode root,int target)
    {
        if(root==null)
        {
            return;
        }
        list.add(root.val);
        if(root.left==null && root.right==null)
        {
            int sum=0;
            for(int i:list)
            {
                sum+=i;
            }
            if(sum==target)
            {
                l1.add(list);
            }
        }
        help(new ArrayList<>(list),root.left,target);
        help(new ArrayList<>(list),root.right,target);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
     help(new ArrayList<>(),root,targetSum);
     return l1;
    }
}
