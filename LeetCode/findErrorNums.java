class Solution {
    public int[] findErrorNums(int[] nums) {
      int d=-1,m=-1;
      HashMap<Integer,Integer> map=new HashMap<>();
      for(int n:nums)
      {
          map.put(n, map.getOrDefault(n,0)+1);
      }
      for(int i=1;i<=nums.length;i++)
      {
          if(map.containsKey(i)){
             if(map.get(i)==2)
             d=i;
           } else {
               m=i;
           }
      }
    return new int[]{d,m};
    }
}
