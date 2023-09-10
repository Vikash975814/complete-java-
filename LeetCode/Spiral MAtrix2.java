class Solution {
    public int[][] generateMatrix(int n) {
        int matrix[][]=new int[n][n];
        int sr=0,er=n-1,sc=0,ec=n-1,p=1;
        while(sr<=er && sc<=ec)
        {
          for(int i=sc;i<=ec;i++)
          {
              matrix[sr][i]=p;
               p++;
          }
          for(int i=sr+1;i<=er;i++)
          {
              matrix[i][ec]=p;
              p++;
          }
          for(int i=ec-1;i>=sc;i--)
          {
              if(sc==ec)
              {
                  break;
              }
              matrix[er][i]=p;
              p++;
          }
          for(int i=er-1;i>=sr+1;i--)
          {
              if(sc==ec)
              {
                  break;
              }
              matrix[i][sc]=p;
              p++;
          }
          sr++;
          sc++;
          er--;
          ec--;
        }
        return matrix;
    }
}
