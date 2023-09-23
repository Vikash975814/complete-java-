class Solution {
    public void transpose(int src[][],int target[][])
    {
        for(int i=0;i<src.length;i++)
        {
            for(int j=0;j<src[0].length;j++)
            {
                target[i][j]=src[j][i];
            }
        }
    }
    public int equalPairs(int[][] grid) {
        int [][] ans=new int[grid.length][grid.length];
        transpose(grid,ans);
        int count=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid.length;j++)
            {
                if(Arrays.equals(ans[j],grid[i]))
                count++;
            }
        }
        return count;
    }
}
