class Solution {
    public int rob(int[] nums) {
       int dp[]=new int[nums.length+3];
       for(int i=3;i<dp.length;i++)
       {
         dp[i]=Math.max(dp[i-2],dp[i-3])+nums[i-3];
       }
       return Math.max(dp[dp.length-1],dp[dp.length-2]);
    }
}
