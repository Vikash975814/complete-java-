public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int x=0;
        int b=31;
        while(b>=0){
            x = x | (((n >> b) & 1) << (31 - b));
            b--;
        }
        return x;
    }
}
