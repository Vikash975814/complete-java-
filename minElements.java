class Solution {
    public int minElements(int[] nums, int limit, int goal) {
        long sum = 0;
        for (int i=0;i<nums.length;i++) {
            sum += nums[i];
        }
        long diff = Math.abs(goal - sum);
        long count = diff / limit;
        if (diff % limit != 0) {
            count++;
        }
        return (int) count;
    }
}
