class Solution {
    public List<List<Integer>> combine(int n, int k) {
     List<List<Integer>> list=new ArrayList<>();
     combAdd(1,n,list,new ArrayList(), k); 
     return list;  
    }
    public void combAdd(int start,int n,List<List<Integer>> list,   List<Integer> current, int k){
    if(current.size()==k)
    {
  list.add(new ArrayList(current));
    }
    for(int i=start;i<=n;i++)
    {
        current.add(i);
        combAdd(i+1,n,list,current,k);
        current.remove(current.size()-1);
    }
}
}
