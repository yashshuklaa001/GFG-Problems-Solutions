class Solution {
    public int findKRotation(int arr[]) {
        int low = 0;
        int high = arr.length - 1;
        int n = arr.length;
        if (n == 1) return 0;
        int ansIndex = 0;
        int ansValue = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[low] <= arr[mid]) {
                if (arr[low] < ansValue) {
                    ansValue = arr[low];
                    ansIndex = low;
                }
                low = mid + 1;
            }
            else {
                if (arr[mid] < ansValue) {
                    ansValue = arr[mid];
                    ansIndex = mid;
                }
                high = mid - 1;
            }
        }
        return ansIndex;
    }
}
