class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
    HashSet<Integer> s1=new HashSet<>();
    HashSet<Integer> s2=new HashSet<>();
    for(int i:nums1)
    {
      s1.add(i);
    }
    for(int i:nums2)
    {
      s2.add(i);
    }
    ArrayList<List<Integer>> l=new ArrayList<>();
    ArrayList<Integer> l1=new ArrayList<>();
    ArrayList<Integer> l2=new ArrayList<>();
     for(int i: s1)
     {
      if(!s2.contains(i)){
        l1.add(i);
      }
     }
     for(int i: s2)
     {
      if(!s1.contains(i)){
        l2.add(i);
      }
     }
     l.add(l1);
     l.add(l2);
     return l;
    }
}
