public class Solution {
    public int hammingWeight(int n) {
        int count=0,mask=1;
     for(int i=0;i<32;i++)
     {
         if((mask & n)!=0)
         {
         count++;
         }
         mask<<=1;
     }
     return count;
    }
}
