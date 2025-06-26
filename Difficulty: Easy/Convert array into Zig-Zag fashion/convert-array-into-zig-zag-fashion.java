class Solution {
    public static void zigZag(int[] arr) {
        boolean less = true; // Indicates if arr[i] < arr[i+1]

        for (int i = 0; i < arr.length - 1; i++) {
            if (less) {
                if (arr[i] > arr[i + 1]) {
                    // Swap to satisfy arr[i] < arr[i+1]
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            } else {
                if (arr[i] < arr[i + 1]) {
                    // Swap to satisfy arr[i] > arr[i+1]
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            less = !less; // Toggle condition
        }
    }
}
