class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i;
        for(i=0;i<nums.length-3;i=i+3)
        {
        if(nums[i]!=nums[i+2])
          break;
        }
        return nums[i];
    }
}
