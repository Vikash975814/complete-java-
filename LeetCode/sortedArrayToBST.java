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
        public TreeNode Binary(int arr[],int left,int right)
        {
            int mid=left+(right-left)/2;
            if(left>right)
            return null;
            TreeNode root=new TreeNode(arr[mid]);
            root.left=Binary(arr,left,mid-1);
            root.right=Binary(arr,mid+1,right);
            return root;
        }
public TreeNode sortedArrayToBST(int[] nums) {
    if(nums.length==0)
    return null;
    return Binary(nums,0,nums.length-1);
    }
}
