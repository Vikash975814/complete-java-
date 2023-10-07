class Solution{
  long maxSubarraySum(int arr[], int n){
long cs=0,ms=Long.MIN_VALUE;
for(int i=0;i<n;i++)
{
    cs+=arr[i];
    if(cs>ms)
    {
        ms=cs;
    }
    if(cs<0)
    {
        cs=0;
    }
}
return ms;
    }
    
}
