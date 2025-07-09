import java.util.*;

class Solution {
    public int[] leftSmaller(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && s.peek() >= arr[i]) {
                s.pop();
            }
            list.add(s.isEmpty() ? -1 : s.peek());
            s.push(arr[i]);
        }

        int[] arrr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arrr[i] = list.get(i);
        }
        return arrr;
    }
}
