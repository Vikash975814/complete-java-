class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start=0,end=letters.length-1,mid;
        while(start<=end)
        {
          mid=(start+end)/2;
          if(letters[mid]>target)
          {
              end=mid-1;
          }else{
              start=mid+1;
          }
        }
        if(start==letters.length)
        {
           return letters[0];           
        }else{
            return letters[start];
        }
    }
}
