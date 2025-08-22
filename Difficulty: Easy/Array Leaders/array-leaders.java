import java.util.*;

class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;

        int currMax = arr[n - 1];
        list.add(currMax);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= currMax) {
                currMax = arr[i];
                list.add(currMax);
            }
        }

        Collections.reverse(list);
        return list;
    }
}
