import java.util.*;

class Solution {
    public int[] leftSmaller(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!stack.isEmpty() && stack.peek()>=arr[i]){
                stack.pop();
            }
            list.add(stack.isEmpty()?-1:stack.peek());
            stack.push(arr[i]);
        }
        int arrr[]=new int[arr.length];
        for(int i=0;i<arrr.length;i++){
            arrr[i]=list.get(i);
        }
        return arrr;
    }
}
