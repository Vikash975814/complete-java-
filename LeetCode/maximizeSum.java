class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int sum=0;
        int n=nums.length-1;
        for(int i=0;i<k;i++)
        {
               sum=sum+nums[n];
            nums[n]=nums[n]+1;
        }
        return sum;
    }
}
