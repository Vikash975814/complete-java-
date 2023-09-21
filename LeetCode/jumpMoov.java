class Solution {
    public boolean canJump(int[] nums) {
        int current=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i>current)
            return false;
            current=Math.max(current,nums[i]+i);
        }
        return true;
    }
}
