import java.util.*;

class Solution {
    static int inversionCount(int arr[]) {
        return mergeSort(arr, 0, arr.length - 1);
    }

    static int mergeSort(int[] arr, int l, int r) {
        int count = 0;
        if (l < r) {
            int mid = l + (r - l) / 2;
            count += mergeSort(arr, l, mid);
            count += mergeSort(arr, mid + 1, r);
            count += merge(arr, l, mid, r);
        }
        return count;
    }

    static int merge(int[] arr, int l, int mid, int r) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = l, j = mid + 1, swaps = 0;

        while (i <= mid && j <= r) {
            if (arr[i] <= arr[j]) {
                list.add(arr[i++]);
            } else {
                list.add(arr[j++]);
                swaps += (mid - i + 1); // all remaining elements in left part are > arr[j]
            }
        }

        while (i <= mid) list.add(arr[i++]);
        while (j <= r) list.add(arr[j++]);

        // copy back to arr
        for (int k = l; k <= r; k++) {
            arr[k] = list.get(k - l);
        }

        return swaps;
    }
}
