import java.util.*;

class Solution {
    public ArrayList<ArrayList<Integer>> subsets(int arr[]) {
        Arrays.sort(arr); // ensure sorted
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        helper(0, arr, new ArrayList<>(), result);
        return result;
    }

    private void helper(int index, int[] arr, ArrayList<Integer> current, ArrayList<ArrayList<Integer>> result) {
        result.add(new ArrayList<>(current));
        for (int i = index; i < arr.length; i++) {
            current.add(arr[i]);
            helper(i + 1, arr, current, result);
            current.remove(current.size() - 1);
        }
    }
}
