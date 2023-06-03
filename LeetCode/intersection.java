class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    HashSet<Integer> x=new HashSet<>();
    HashSet<Integer> y=new HashSet<>();
     for(int nums: nums1){
        x.add(nums); 
     }
     for(int nums:nums2){
         if(x.contains(nums)){
             y.add(nums);
         }
     }
     int [] output=new int[y.size()];
     int i=0;
     for(int l:y){
         output[i]=l;
         i++;
     }
     return output;
    }
}
