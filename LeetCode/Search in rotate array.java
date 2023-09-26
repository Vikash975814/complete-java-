class Solution {
    public static int binary(int nums[],int target,int s,int e)
    {
        int mid;
        while(s<=e)
        {
            mid=(s+e)/2;
            if(nums[mid]==target)
            {
                return mid;
            }else if(nums[mid]>target)
            {
                e=mid-1;
            }else{
                s=mid+1;
            }
           
        }
         return -1;
    }
    public int search(int[] nums, int target) {
     if(nums.length==1)
     {
         if(nums[0]==target)
         {
         return 0;
     }else {
         return -1;
     }
     }
     if(nums[0]<nums[nums.length-1])
     {
         return binary(nums,target,0,nums.length-1);
     }
       int s=0,e=nums.length-1,mid;
       while(s<=e)
       {
           mid=(s+e)/2;
           if(nums[mid+1]<nums[mid])
           {
               return Math.max(binary(nums,target,0,mid),binary(nums,target,mid+1,nums.length-1));
           } else if(nums[mid-1]>nums[mid])
           {
               return Math.max(binary(nums,target,0,mid-1),binary(nums,target,mid,nums.length-1));
           }else if(nums[mid]>nums[0]){
                   s=mid+1;
           }else{
               e=mid-1;
           }
       }
       return -1;
    }
}
