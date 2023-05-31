class Solution {
    public int maximumWealth(int[][] accounts) {
        int maximum=-1;
        for(int i=0;i<accounts.length;i++)
        {
             int sum=0;
            for(int j=0;j<accounts[i].length;j++)
            {
                sum=sum+accounts[i][j];
}
            maximum=Math.max(sum,maximum);
}
        return maximum;
    }
}
