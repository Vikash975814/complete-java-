class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum=0;
        for (int i = 0; i <arr.length;i++) {
            sum += arr[i] * ((i / 2) + 1) * ((arr.length-1-i) / 2 + 1);
            sum += arr[i] * ((i + 1) / 2) * ((arr.length-i) / 2);
        }
        return sum;
    }
}
