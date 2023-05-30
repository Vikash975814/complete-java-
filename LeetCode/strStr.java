class Solution {
    public int strStr(String haystack, String needle) {
        int m = needle.length();
        int n = haystack.length();
        for (int j= 0;j <= n - m; j++) {
            for (int i = 0; i < m; i++) {
                if (needle.charAt(i) != haystack.charAt(j + i)) {
                    break;
                }
                if (i == m - 1) {
                    return j;
                }
            }
        }

        return -1;
    }
}
