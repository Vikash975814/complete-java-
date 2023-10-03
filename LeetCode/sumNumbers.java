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
   public void binary(ArrayList<Integer> list,TreeNode root,String s)
    {
      if(root.left==null && root.right==null)
      {
        s+=root.val;
        int sum=Integer.parseInt(s);
        list.add(sum);
        s=s.substring(0,s.length()-1);
      }
      s+=root.val;
      if(root.left!=null)
      {
        binary(list,root.left,s);
      }
    if(root.right!=null)
      {
        binary(list,root.right,s);
    }
    s=s.substring(s.length()-1);
    return;
}
    public int sumNumbers(TreeNode root) {
     ArrayList<Integer> list=new ArrayList<>();
       binary(list,root,"");
       int add=0;
       for(int i:list)
       {
         add+=i;
       }
       return add;
    }
}
   
