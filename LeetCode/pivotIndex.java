class Solution {
    public int pivotIndex(int[] nums) {
       int sum=0,temp=0;
       for(int i=0;i<nums.length;i++)
       {
           sum=sum+nums[i];
       } 
       for(int i=0;i<nums.length;i++)
       {
           sum=sum-nums[i];
           if(sum==temp)
           {
               return i;
           }
           temp=temp+nums[i];
       }
       return -1;
    }
}
