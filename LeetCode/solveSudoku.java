class Solution {
    public void solveSudoku(char[][] board) {
        solve(board, 0, 0);
    }
    public static boolean solve(char[][] board, int row, int col) {
        if (row == board.length) {
            return true;
        }
        int nextrow=row,nextcol=col+1;
        if(col+1==board.length){
            nextrow=row+1;
            nextcol=0;
}
        if (board[row][col] != '.') {
            return solve(board, nextrow,nextcol);
        }
        for (char num = '1'; num <= '9'; num++) {
            if (issafe(board, row, col, num)) {
                board[row][col] = num; 
                if (solve(board, nextrow, nextcol)) {
                    return true;
                }
                board[row][col] = '.';
            }
        }
        return false;
    }
      public static boolean issafe(char[][] board, int row, int col, char num) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == num) {
                return false;
            }
        }
        for(int j=0;j<board.length;j++){
            if (board[row][j] == num) {
                return false;
            }
        }
            int sr = 3 * (row / 3);
            int sc=3*(col/3);
 for(int i=sr;i<sr+3;i++){
     for(int j=sc;j<sc+3;j++){
     if(board[i][j]==num){
         return false;
}
         }
 }
          return true;
      }
}
