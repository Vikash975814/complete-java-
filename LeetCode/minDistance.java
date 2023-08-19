       class Solution {
    public int minDistance(String word1, String word2) {
       int a=word1.length();
       int b=word2.length();
       int dp[][]=new int[a+1][b+1];
       for(int i=0;i<=a;i++)
       {
           for(int j=0;j<=b;j++)
           {
               if(i==0)
               {
                   dp[i][j]=j;
               }else if(j==0){
                   dp[i][j]=i;
               }else if(word1.charAt(i-1)==word2.charAt(j-1)){
                   dp[i][j]=dp[i-1][j-1];
               }else{
                   dp[i][j]=1+(Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1])));
               }
           }
       }
       return dp[a][b];
    }
}
