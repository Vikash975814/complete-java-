class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list =new ArrayList<>();
        int start=0;
        int end=nums.length;

        for(int i=0;i<nums.length;i++){
            start=i;

            while(i!=nums.length-1 && nums[i]+1==nums[i+1]){
               i++; 

            }
            end=i;
            if(start==end)
            list.add(""+nums[start]);
            else
            list.add(nums[start]+"->"+nums[end]);
        }
        return list;
        
    }
}
