class Solution {
    public int arraySign(int[] nums) {
        double n=1;
        for(int i=0;i<nums.length;i++)
        {
            n=n*nums[i];
}
        if(n>0)
            return 1;
        else if(n<0)
            return -1;
        else
            return 0;
    }
}
