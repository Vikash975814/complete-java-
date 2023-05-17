class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int dif=0,n;
      for(int i=0;i<nums.length;i++){
          sum=sum+nums[i];
}
         for(int i=0;i<nums.length;i++){
         for(int j=0;j<nums.length;j++){
        while(nums[j] > 0){
            n = nums[j] % 10;
            dif+= n;
            nums[j] = nums[j] / 10;
        }
         }
        }
        int total=sum-dif;
        return total;
    }
}
