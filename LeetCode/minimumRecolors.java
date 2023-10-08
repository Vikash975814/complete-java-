class Solution {
    public int minimumRecolors(String blocks, int k) {
      int count=k+1;
      for(int i=0;i<=blocks.length()-k;i++)
      {
          String b=blocks.substring(i,i+k);
          int a=b.split("W",-1).length-1;
          count=Math.min(count,a);
      }
      return count;
    }
}
