class Solution {
    public List<Integer> majorityElement(int[] nums) {
         HashMap<Integer,Integer> map=new HashMap<>();
         ArrayList<Integer> list=new ArrayList<>();
         for(int i=0;i<nums.length;i++)
         {
             map.put(nums[i],map.getOrDefault(nums[i],0)+1);
         }
         for(Integer key:map.keySet())
         {
             if(map.get(key)>nums.length/3)
             list.add(key);
         }
         return list;
    }
}
