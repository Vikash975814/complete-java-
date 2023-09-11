class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> comb=new ArrayList<>();
        combtracker(0,comb,new ArrayList(),candidates,target);
        return comb;
    }
    public void combtracker(int start, List<List<Integer>> comb,List<Integer> list,int[] nums,int target)
    {
        if(target==0)
        {
            comb.add(new ArrayList(list));
        }
        if(target<0)
        {
            return;
        }
        for(int i= start;i<nums.length;i++)
        {
            list.add(nums[i]);
            combtracker(i,comb,list,nums,target-nums[i]);
            list.remove(list.size()-1);
        }
    }
}
