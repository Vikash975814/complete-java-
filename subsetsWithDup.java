class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
       List<List<Integer>> list=new ArrayList<>();
       list.add(new ArrayList<>());
       int s=0,e=0;
       for(int i=0;i<nums.length;i++)
       {
           s=0;
           if(i>0 && nums[i]==nums[i-1]){
               s=e+1;
           }
            e=list.size()-1;
           int n=list.size();
           for(int j=s;j<n;j++)
           {
               List<Integer> temp=new ArrayList<>(list.get(j));
               temp.add(nums[i]);
               list.add(temp);

           }
       } 
       return list;
    }
}
