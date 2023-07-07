class Solution {
    public int[] sortArrayByParityII(int[] nums) {
          int i=0,j=1;
          while(i<nums.length && j<nums.length)
          {
              if(nums[j]%2==0)
              {
              int temp=nums[i];
              nums[i]=nums[j];
              nums[j]=temp;
                  i=i+2;
              }else{
                  j=j+2;
              }
          }
          return nums;
    }
}
