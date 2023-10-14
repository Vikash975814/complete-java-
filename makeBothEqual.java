public class Solution {
    static int makeBothEqual(int n, int m, String s, String t) {
        // Write your code here.
        if(m>n)
        {
            return 0;
        }
        if(s.contains(t))
        {
            return 1;
        }
        return 0;
    }
}
