class Solution {
    public int findNonMinOrMax(int[] nums) {
        Arrays.sort(nums);
        int n;
       /* ArrayList<Integer> list=new ArrayList<>();
        int n,i;
        if(nums.length==0 || nums.length==1 || nums.length==2)
        {
            return -1;
        }else{
            for(i=1;i<nums.length-1;i++)
            {
                if(nums[i]!=nums[i+1])
                list.add(nums[i]);
            }
        }
        return list.get(list.size()-1);*/
        if(nums.length==0 || nums.length==1 || nums.length==2)
        {
            return -1;
        }else{
             n= nums[nums.length-2];
    }
    return n;
}
}
