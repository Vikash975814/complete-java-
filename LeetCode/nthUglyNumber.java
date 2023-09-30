class Solution {
    public int nthUglyNumber(int n) {
    int dp[]=new int[n];
    dp[0]=1;
    int i1=0,i2=0,i3=0,f1=2,f2=3,f3=5;
    for(int i=1;i<n;i++)
    {
        int m=Math.min(Math.min(f1,f2),f3);
        dp[i]=m;
        if(f1==m)
        {
            f1=2*dp[++i1];
        }
        if(f2==m)
        {
            f2=3*dp[++i2];
        }
        if(f3==m)
        {
            f3=5*dp[++i3];
        }
    }
    return dp[n-1];
    }
}
