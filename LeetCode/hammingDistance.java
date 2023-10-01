class Solution {
    public int hammingDistance(int x, int y) {
        int count=0;
      int a=x^y;
      String b=Integer.toBinaryString(a);
      for(int i=0;i<b.length();i++)
      {
          if(b.charAt(i)=='1')
          count++;
      }
      return count;
    }
}
