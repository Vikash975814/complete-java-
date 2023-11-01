class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        helper("(",1,0,list,n);
        return list;
    }
    void helper(String c,int o,int cl,List<String> list,int n)
    {
        if(c.length()==2*n)
        {
            list.add(c);
            return;
        }
        if(o<n)
        {
            helper(c+"(",o+1,cl,list,n);
        }
            if(cl<o)
        {
            helper(c+")",o,cl+1,list,n);
        }
    }
}
