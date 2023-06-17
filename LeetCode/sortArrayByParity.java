class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int list[]=new int[nums.length];
        int t=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
             list[t++]=nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==1)
           list[t++]=nums[i];
        }
        return list;
    }
}
