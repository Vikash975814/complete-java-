class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = 0;
        for (int i : candies) {
            n = Math.max(i, n);
        }
        List<Boolean> result = new ArrayList<>();
        for (int i : candies) {
            result.add(i + extraCandies >= n);
        }
        return result;
    }
}
