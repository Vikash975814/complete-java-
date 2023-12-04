class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int [] result=new int[heights.length];
        Stack<int[]> s=new Stack<>();
        for(int i=0;i<heights.length;i++)
        {
            int h=heights[i];
            while(!s.isEmpty() && s.peek()[0]<h)
            {
                int prev=s.pop()[1];
                result[prev]++;
            }
            if(!s.isEmpty())
            {
                result[s.peek()[1]]++;
            }
            s.push(new int[] { h,i});
        }
        return result;
    }
}
