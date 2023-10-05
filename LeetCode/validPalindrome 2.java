class Solution {
    public boolean validPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                return func(s, i + 1, j) || func(s, i, j - 1);
            }
        }
        return true;
    }

    public boolean func(String str, int i, int j) {
        while (i <= j) {
            if (str.charAt(i) == str.charAt(j)) {
            i++;
            j--;
            } else{
                return false;
        }
        }
        return true;
    }
}
