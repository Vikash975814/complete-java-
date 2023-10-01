class Solution {
    public boolean find132pattern(int[] nums) {
    int arr[]=new int[nums.length];
    arr[0]=nums[0];
    for(int i=1;i<nums.length;i++)
    {
        arr[i]=Math.min(arr[i-1],nums[i]);
    }
    Stack<Integer> s=new Stack<>();
    for(int i=nums.length-1;i>=0;i--)
    {
        if(nums[i]>arr[i])
        {
            while(!s.isEmpty() && s.peek()<=arr[i])
            {
                s.pop();
            }
            if(!s.isEmpty() && s.peek()<nums[i])
        {
            return true;
        }
            s.push(nums[i]);
        }
    }
    return false;
    }
}
