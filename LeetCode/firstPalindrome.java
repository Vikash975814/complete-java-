class Solution {
    public String firstPalindrome(String[] words) {
        for(String s: words)
        {
            StringBuffer sb=new StringBuffer(s);
            String z=(sb.reverse()).toString();
            if(s.equals(z))
            return s;
        }
        return "";
    }
}
