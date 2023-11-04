class Solution {
    public static void backtrack(List<List<Integer>> list,List<Integer> temp,int nums[])
    {
        if(temp.size()==nums.length)
        {
            list.add(new ArrayList<>(temp));
            return;
        }
        for(int i:nums)
        {
            if(temp.contains(i))
            continue;
            temp.add(i);
        backtrack(list,temp,nums);
        temp.remove(temp.size()-1);
    }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        backtrack(list,new ArrayList<>(),nums);
        return list;
    }
}
