class Solution {
    public boolean isPalindrome(int x) {
         boolean palind=true;
        if(x<0)
            palind=false;
        else{
            int rev=0;
            int num=x;
            while(x!=0)
            {
                rev=rev*10 +(x%10);
                x/=10;
            }
            if(rev!=num)
                palind=false;
        }
        return palind;
    }
}
