import java.util.*;

class Solution {
    public ArrayList<ArrayList<Integer>> countFreq(int[] arr) {
        // Count frequencies using HashMap
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Build the result list directly
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(map.size());
        for (var entry : map.entrySet()) {
            list.add(new ArrayList<>(Arrays.asList(entry.getKey(), entry.getValue())));
        }

        return list;
    }
}
