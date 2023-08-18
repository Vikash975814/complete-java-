class Solution {
    public String solution(int U, int L, int[] C) {
        int N = C.length;
        int[][] matrix = new int[2][N];
        
        for (int i = 0; i < N; i++) {
            if (C[i] == 2) {
                matrix[0][i] = 1;
                matrix[1][i] = 1;
                U--;
                L--;
            } else if (C[i] == 1) {
                if (U > L) {
                    matrix[0][i] = 1;
                    U--;
                } else {
                    matrix[1][i] = 1;
                    L--;
                }
            }
        }
        
        if (U != 0 || L != 0) {
            return "IMPOSSIBLE";
        }
        
        StringBuilder upperRow = new StringBuilder();
        StringBuilder lowerRow = new StringBuilder();
        
        for (int i = 0; i < N; i++) {
            upperRow.append(matrix[0][i]);
            lowerRow.append(matrix[1][i]);
        }
        
        return upperRow.toString() + "," + lowerRow.toString();
    }
}
