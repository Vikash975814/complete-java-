class Solution {
    private int diff(String r){
        int sum=0;
        for(int i=0;i<r.length();i++)
            sum+=(int) r.charAt(i);
        return sum;
    }
    public char findTheDifference(String s, String t) {
        return (char)(diff(t)-diff(s));
    }
}
