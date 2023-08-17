class Solution {
    public int[][] merge(int[][] intervals) {
      Arrays.sort(intervals,(A,B)->A[0]-B[0]);
      ArrayList<int[]> list=new ArrayList<>();
      int n1=intervals[0][0];
      int n2=intervals[0][1];
      for(int i=1;i<intervals.length;i++)
      {
      int s=intervals[i][0];
      int e=intervals[i][1];
      if(s<=n2){
          n2=Math.max(n2,e);
      }  else{
          list.add(new int[]{n1,n2});
          n1=s;
          n2=e;
      }
      }
      list.add(new int[]{n1,n2});
      return list.toArray(new int[0][]);
    }
}
