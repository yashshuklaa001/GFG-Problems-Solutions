// User function Template for Java

class Solution {
    static void reverse(Stack<Integer> s) {
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverse(s);
        insertAtBottom(top , s);
    }
    static void insertAtBottom(int topValue , Stack<Integer> s){
            if(s.isEmpty()){
                s.push(topValue);
                return;
            }
            int top = s.pop();
            insertAtBottom(topValue,s);
            s.push(top);
        }
}