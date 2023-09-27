class Solution {
    public int[] numberOfPairs(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==1)
        {
            int arr[]={0,1};
             return arr;
        }
        int i=0,pair=0,leftover=0;
        while(i<nums.length-1)
        {
          if(nums[i]==nums[i+1])
          {
              pair++;
              i=i+2;
          }else{
              leftover++;
              i++;
          }
        }
        if(i!=nums.length)
        {
            leftover++;
        }
           int  []arr={pair,leftover};
         return arr;
    }
}
