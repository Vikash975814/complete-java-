class Solution {
    // public static long maxMin(int arr[],int i,int j)
    // {
    //     long max=Integer.MIN_VALUE;
    //     long min=Integer.MAX_VALUE;
    //     for(int k=i;k<=j;k++)
    //     {
    //         max=Math.max(max,arr[k]);
    //         min=Math.min(min,arr[k]);
    //     }
    //     return max-min;
    // }
    public long subArrayRanges(int[] nums) {
    //    long sum=0;
    //     for(int i=0;i<nums.length;i++)
    //     {
    //         for(int j=i;j<nums.length;j++)
    //         {
    //              sum+=maxMin(nums,i,j);
    //         }
    //     }
    //     return sum;
          long sum=0;
        for (int i = 0; i <nums.length;i++) {
            int min = nums[i], max = nums[i];
            for (int j =i;j <nums.length;j++) {
                min = Math.min(min, nums[j]);
                max = Math.max(max, nums[j]);
                sum += max - min;
            }
        }
        return sum;
    }
}
