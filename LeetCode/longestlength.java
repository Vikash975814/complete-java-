class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums==null || nums.length==0)
        return 0;
        int arr[]=new int[nums.length];
        Arrays.fill(arr,1);
        for(int i=1;i<nums.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(nums[i]>nums[j])
                {
                    arr[i]=Math.max(arr[i],arr[j]+1);
                }
            }
        }
        int length=Arrays.stream(arr).max().orElse(0);
        return length;
    }
}
