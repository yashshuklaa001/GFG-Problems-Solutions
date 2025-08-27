
class Solution {
    static void reverse(Stack<Integer> St) {
        if(St.isEmpty()){
            return;
        }
        int top=St.pop();
        reverse(St);
        insertAtBottom(top,St);
    }
    public static void insertAtBottom(int topValue,Stack<Integer> stack){
        if(stack.isEmpty()){
            stack.push(topValue);
            return;
        }
        int top=stack.pop();
        insertAtBottom(topValue,stack);
        stack.push(top);
    }
}