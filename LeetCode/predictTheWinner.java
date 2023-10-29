class Solution {
    public int rec(int nums[],int start,int end)
    {
        if(start==end)
    {
        return nums[start];
    }
    int left=nums[start]-rec(nums,start+1,end);
    int right=nums[end]-rec(nums,start,end-1);
    return Math.max(left,right);
    }
    public boolean predictTheWinner(int[] nums) {
        return rec(nums,0,nums.length-1)>=0;
    }
}
