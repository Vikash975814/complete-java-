class Solution {
    public static boolean pal(int i,int j,String str)
    {
        while(i<j-1)
        {
            if(str.charAt(i)!=str.charAt(j-1))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
      for(int j=s.length();j>0;j--)
      {
          for(int i=0;i<=s.length()-j;i++)
          {
              if(pal(i,j+i,s))
              {
              return s.substring(i,j+i);
          }
          }
      }
      return "";
}
}
