 class Solution {
       public int mostFrequentEven(int[] nums) {
         Arrays.sort(nums);
        int min=-1,count=0,count1=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0){
                count++;
                 if(count>count1){
                    count1=count;
                    min=nums[i];
          }
            }
            if(i<nums.length-1){
             if(nums[i]!=nums[i+1])
                    count=0;
}
}
        return min;
    }
}
