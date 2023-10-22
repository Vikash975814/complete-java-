class Solution {
    public boolean rotateString(String s, String goal) {
        String s1 = s.concat(s);
        if(s1.contains(goal) && s.length()==goal.length())
        {
            return true;
        }
        return false;
    }
}
