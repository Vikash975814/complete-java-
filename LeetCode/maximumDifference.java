class Solution {
    public int maximumDifference(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                sum=Math.max(sum,nums[j]-nums[i]);
            }
        }
          if(sum==0)
          {
              return -1;
          }
          return sum;
   }
}
