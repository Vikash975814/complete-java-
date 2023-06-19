class Solution {
    public int maxChunksToSorted(int[] arr) {
       int ch=0;
       int r=Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++)
       {
           r=Math.max(r,arr[i]);
           if(r==i)
           ch++;
       }
       return ch;
    }
}
