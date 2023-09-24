class Solution {
    public int[] twoSum(int[] nums, int target) {
  HashMap<Integer,Integer> hp=new HashMap<>();
    for(int i=0;i<nums.length;i++)
    {
        if(hp.containsKey(target-nums[i]))
        {
           int arr[]={hp.get(target-nums[i]),i};
            return arr;
        }else{
            hp.put(nums[i],i);
        }
    }
    int arr[]={-1,-1};
    return arr;
    }
}
TC=O(n);
SC=O(n);
