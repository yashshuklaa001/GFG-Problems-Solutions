import java.util.*;

class Solution {
    public ArrayList<Integer> intersection(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        // Add all elements from arr1 into the set
        for (int num : arr1) {
            set.add(num);
        }

        // Check each element of arr2
        for (int num : arr2) {
            if (set.contains(num)) {
                list.add(num);
                set.remove(num); // remove to avoid duplicates in the result
            }
        }

        // If no intersection, return an empty list
        return list;
    }
}
