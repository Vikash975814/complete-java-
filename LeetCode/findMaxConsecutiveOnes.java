class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int once=0;
        int max=0;
        for(int i=0;i<nums.length;i++)
        { 
            if(nums[i]==0)
            {
                once=0;
            }else{
                once++;
            }
            if(once>max)
            {
                max=once;
            }
            }
        return max;
    }
}
