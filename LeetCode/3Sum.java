class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      List<List<Integer>> ll=new ArrayList<>();
      HashSet<List<Integer>> hs=new HashSet<>();
      Arrays.sort(nums);
      for(int i=0;i<nums.length;i++)
      {
          int a=i+1,b=nums.length-1;
        while(a<b)
        {
          if(nums[i]+nums[a]+nums[b]==0)
          {
              List<Integer> list=new ArrayList<>();
              list.add(nums[i]);
              list.add(nums[a]);
              list.add(nums[b]);
              hs.add(list);
              a++;
          }else if(nums[i]+nums[a]+nums[b]>0)
          {
              b--;
          }else{
              a++;
          }
        }
      }
      for(List<Integer> l:hs)
      {
          ll.add(l);
      }
      return ll;
    }
}
