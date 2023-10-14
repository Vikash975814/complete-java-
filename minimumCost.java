public class Solution {
    static int minimumCost(int n, int x, int y, String s) {
        // Write your code here.
        int vcount=0,ccount=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
            {
                vcount++;
            }else{
                ccount++;
            }
        }
        return Math.min((vcount*x),(ccount*y));
    }
}
