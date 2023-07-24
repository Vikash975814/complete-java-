class Solution {
    public int maxPower(String s) {
        int count=0;
        int sum=0;
        char ch=' ';
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==ch)
            {
                count++;
            }else{
                count=1;
                ch=s.charAt(i);
            }
            sum=Math.max(sum,count);
        }
        return sum;
    }
}
