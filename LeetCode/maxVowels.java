class Solution {
    public int isVowel(char c)
    {
        return (c=='a' || c=='e'|| c=='i'|| c=='o'|| c=='u')?1:0;
    }
    public int maxVowels(String s, int k) {
        int r=0,window=0,max=0,i=0;
          while(i<k)
        {
            window+=isVowel(s.charAt(i++));
        }
        max=window;
        while(i<s.length())
        {
          window-=isVowel(s.charAt(r++));
          window+=isVowel(s.charAt(i++));
          max=Math.max(max,window);
        }
        return max;
    }
}
