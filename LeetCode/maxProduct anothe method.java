class Solution {
   public int maxProduct(int[] nums) {
   int max=nums[0],min=nums[0],ans=nums[0];
   for(int i=1;i<nums.length;i++)
   {
       int temp=Math.max(Math.max(nums[i],nums[i]*max),nums[i]*min);
       min=Math.min(Math.min(nums[i],nums[i]*min),nums[i]*max);
       max=temp;
       ans=Math.max(max,ans);
   }
   return ans;
   }
}
