class Solution {
    public int findMin(int[] nums) {
       if(nums.length==1 || nums[0]<nums[nums.length-1])
       {
           return nums[0];
       }
       int s=0,e=nums.length-1,mid;
       while(s<=e)
       {
           mid=(s+e)/2;
           if(nums[mid+1]<nums[mid])
           {
               return nums[mid+1];
           } else if(nums[mid-1]>nums[mid])
           {
               return nums[mid];
           } else if(nums[mid]>nums[0])
           {
                s=mid+1;
           }else
           {
               e=mid-1;
           }
       }
       return -1;
    }
}
