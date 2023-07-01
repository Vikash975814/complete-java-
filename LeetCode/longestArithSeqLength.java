class Solution {
    public int longestArithSeqLength(int[] nums) {
       int CL=2;
       for(int i=0;i<nums.length-1;i++)
       {
           for(int j=i+1;j<nums.length;j++)
           {
             int diff=nums[j]-nums[i];
             int store=nums[j];
             int lg=2;
             for(int k=j+1;k<nums.length;k++)
             {
                 if(nums[k]-store==diff)
                 {
                     store=nums[k];
                     lg++;
                 }
             }
             CL=Math.max(CL,lg);
           }
       }
       return CL;
    }
}
