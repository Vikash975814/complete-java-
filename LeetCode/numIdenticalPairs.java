class Solution {
    public int numIdenticalPairs(int[] nums) {
        int res = 0;
        int count[] = new int[101];
        for (int a: nums) {
            res=res+count[a]++;
        }
        return res;
    }
    }
