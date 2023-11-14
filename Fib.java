class Solution {
    public int fib(int n) {
        int dp[]=new int[n+1];
        if(n==0 ||n==1)
        {
        return n;
        }
        for(int i=0;i<=n;i++)
        {
            if(i==0)
            {
             dp[i]=0;
            }else if(i==1)
            {
                dp[i]=1;
            }else{
                dp[i]=dp[i-1]+dp[i-2];
            }
        }
        return dp[n];
    }
}
