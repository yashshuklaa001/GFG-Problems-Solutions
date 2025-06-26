class Solution {
    public int maxConsecBits(int[] arr) {
        int maxCount = 1;
        int currCount = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                currCount++;
            } else {
                currCount = 1;
            }
            maxCount = Math.max(maxCount, currCount);
        }

        return maxCount;
    }
}
