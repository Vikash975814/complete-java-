class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int ptr=0;
        int res=(n*(n+1))/2;
        for(int i=0;i<n;i++)
        {
            ptr+=nums[i];
}
        return res-ptr;
    }
    }
