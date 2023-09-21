class Solution {
    public int jump(int[] nums) {
    int moov=0,current=0,k=0;
    for(int i=0;i<nums.length-1;i++)
    {
        k=Math.max(k,nums[i]+i);
        if(i==current)
        {
            current=k;
            moov++;
        }
    }
    return moov;
    }
}
/*
Approach
1.Declare three variable moov,current,k and initial valuu of 0 all variable.
2.Run the loops when reached the second last element
  1.k, have the value of maximum (k,first element of array+index number of array).
  2.if(value of i ==current value) then change the current value and increase the moov.
3. last, return the moov.
*/
