
class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        ArrayList<Integer> list=new ArrayList<>();
        int start=0,last=0,cs=0;
        boolean flag=false;
        for(int i=0;i<n;i++)
        {
            cs+=arr[i];
            if(cs>=s)
            {
                last=i;
                while(s<cs && start<last)
                {
                    cs-=arr[start];
                    start++;
                }
                    if(cs==s)
                    {
                        list.add(start+1);
                        list.add(last+1);
                        flag=true;
                        break;
                    }
            }
        }
        if(flag==false)
        {
            list.add(-1);
        }
        return list;
    }
}
