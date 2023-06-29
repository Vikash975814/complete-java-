class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        Arrays.sort(nums);
        int a=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            continue;
              a=0;
            int n=nums[i]+1;
            for(int j=0;j<nums.length && a<k-1;j++)
            {
                if(nums[j]==0)
                continue;
                if(nums[j]==n){
                 ++n;
                nums[j]=0;
                ++a;
            }
            }
         if(a!=k-1)
            return false;
        }
        return (a==k-1?true:false);
    }
}
