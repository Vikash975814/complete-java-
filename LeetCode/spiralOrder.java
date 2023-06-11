class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> l=new ArrayList<>();
        int sr=0;
        int sc=0;
        int er=matrix.length-1;
        int ec=matrix[0].length-1;
        while(sr<=er && sc<=ec)
        {
            for(int j=sc;j<=ec;j++){
             l.add(matrix[sr][j]);
            }
             sr++;
            for(int i=sr;i<=er;i++){
             l.add(matrix[i][ec]);
            }
             ec--;
            if(sr<=er){
            for(int j=ec;j>=sc;j--){
                l.add(matrix[er][j]);
            }
                er--;
            }
            if(sc<=ec){
            for(int i=er;i>=sr;i--){
             l.add(matrix[i][sc]);
            }
             sc++;
            }
        }
        return l;
    }
}
