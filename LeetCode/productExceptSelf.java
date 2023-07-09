class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int s[]=new int[n];
        int p[]=new int[n];
        int arr[]=new int[n];
           s[0]=1;
          p[n-1]=1;
        for(int i=1;i<n;i++)
        {
            s[i]=s[i-1]*nums[i-1];
        }
        for(int i=n-2;i>=0;i--)
        {
             p[i]=p[i+1]*nums[i+1];
        }
        for(int i=0;i<n;i++)
       {
           arr[i]=s[i]*p[i];
       }
       return arr;
    }
}
