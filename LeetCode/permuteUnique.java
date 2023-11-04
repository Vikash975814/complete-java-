class Solution {
 void backtrack(List<List<Integer>> list,List<Integer> temp,int []nums,boolean[] arr)
    {
        if(temp.size()==nums.length && !list.contains(temp))
        {
            list.add(new ArrayList(temp));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(arr[i])
            continue;
            temp.add(nums[i]);
            arr[i]=true;
            backtrack(list,temp,nums,arr);
            arr[i]=false;
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list=new ArrayList<>();
        backtrack(list,new ArrayList<>(),nums,new boolean [nums.length]);
        return list;
    }
}
