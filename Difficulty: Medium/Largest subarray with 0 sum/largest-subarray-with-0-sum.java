class Solution {
    int maxLen(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == 0) {
                max = i + 1;
            }

            if (map.containsKey(sum)) {
                int prev = map.get(sum);
                max = Math.max(max, i - prev);
            } else {
                map.put(sum, i);
            }
        }

        return max;
    }
}
