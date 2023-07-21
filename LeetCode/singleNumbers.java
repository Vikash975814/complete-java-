class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Integer> ll=new ArrayList<>();
        for(int i:nums)
        {
            if(map.get(i)==1)
            ll.add(i);
        }
        int j=0;
        int ans[]=new int[ll.size()];
        for(int i:ll)
        {
            ans[j]=i;
            j++;
        }
        return ans;
    }
}
