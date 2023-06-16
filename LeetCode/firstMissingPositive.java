class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int l=1;
        for(int i=0;i<nums.length;i++)
            if(nums[i]==l){
                l++;
            }
        return l;
    }
}
