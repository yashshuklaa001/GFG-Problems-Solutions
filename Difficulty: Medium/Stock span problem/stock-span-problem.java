
import java.util.*;

class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        list.add(1);
        stack.push(0);

        for(int day=1; day<arr.length; day++){
            while(!stack.isEmpty() && arr[day] >= arr[stack.peek()]){
                stack.pop();
            }
            list.add(stack.isEmpty() ? (day+1) : (day - stack.peek()));
            stack.push(day);
        }
        return list;
    }
}
