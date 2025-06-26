class Solution {
    int getOddOccurrence(int[] arr, int n) {
        int result = 0;
        for (int num : arr) {
            result ^= num;  // XOR every number
        }
        return result;
    }
}
