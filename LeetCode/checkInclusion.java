class Solution {
     private String sorts(String s)
     {
         char[] arr=s.toCharArray();
         Arrays.sort(arr);
         return new String(arr);
     }
    public boolean checkInclusion(String s1, String s2) {
        s1=sorts(s1);
        for(int i=0;i<=s2.length()-s1.length();i++)
        {
            String s=sorts(s2.substring(i,i+s1.length()));
            if(s1.equals(s))
            return true;
        }
        return false;
    }
}
