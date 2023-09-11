class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> list=new ArrayList<>();
        combSum(0,list,new ArrayList(),candidates,target);
        return list;
    }
 public void combSum(int start,List<List<Integer>> list,List<Integer>
 current,int[] nums,int target)
 {
if(target==0)
{
    list.add(new ArrayList(current));
}
if(target<0)
{
    return;
}
for(int i=start;i<nums.length;i++)
{
    if(i>start && nums[i]==nums[i-1])
     continue;
    current.add(nums[i]);
    combSum(i+1,list,current,nums,target-nums[i]);
    current.remove(current.size()-1);
}
 }    
}
