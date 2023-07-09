class Solution {
    public int subarraySum(int[] nums, int k) {
       // HashMap tecknique with time complexity O(n);
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0,ans=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
            if(map.containsKey(sum-k))
            {
                ans=ans+map.get((sum-k));
            }
            if(map.containsKey(sum))
            {
             map.put(sum,map.get(sum)+1);
            }else{
                map.put(sum,1);
            }
        }
        return ans;

       // Brute Force Approach with time complexity O(n2);
    //  int count=0;
    //  for(int i=0;i<nums.length;i++)
    //  {
    //    int sum=0;
    //    for(int j=i;j<nums.length;j++)
    //    {
    //        sum+=nums[j];
    //        if(sum==k)
    //        count++;
    //    }        
    //  }
    //  return count;
    }
}
