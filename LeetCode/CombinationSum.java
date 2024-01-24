class Solution {
    public static void helper(int ind,int sum,List<Integer> list,List<List<Integer>> mainList,int n,int k)
    {
        if(sum==n && k==0)
        {
        mainList.add(new ArrayList<>(list));
        return;
    }
    if(sum>n)
    {
        return;
    }
    for(int i=ind;i<=9;i++)
    {
        if(i>n)
        break;
        list.add(i);
        helper(i+1,sum+i,list,mainList,n,k-1);
        list.remove(list.size()-1);a
    }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
       List<List<Integer>> mainList=new ArrayList<>();
       List<Integer> list=new ArrayList<>();
        helper(1,0,list,mainList,n,k);
        return mainList;
    }
}
