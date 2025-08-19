class Solution {
    static boolean twoSum(int arr[], int target) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(target - num)) {
                return true; // found a pair
            }
            set.add(num);
        }
        return false;
    }
}
