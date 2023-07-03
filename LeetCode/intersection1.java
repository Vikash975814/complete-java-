class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    HashSet<Integer> set =new HashSet<>();
    for(int i=0;i<nums1.length;i++)
    {
        set.add(nums1[i]);
    } 
     HashSet<Integer> set1 =new HashSet<>();
    for(int j=0;j<nums2.length;j++)
    {
        if(set.contains(nums2[j]))
        {
        set1.add(nums2[j]);
    }
    }
      int arr[]=new int[set1.size()];
    //    Iterator<Integer> it = set1.iterator();
    //     for (int i = 0; i < arr.length; i++) {
    //     arr[i] = it.next();
    //     }
    int k=0;
    for(Integer ele:set1)
    {
     arr[k]=ele;
     k++;
    }
    return arr;
    }
}
