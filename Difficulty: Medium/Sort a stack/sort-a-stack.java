/*Complete the function below*/
class GfG {
    public Stack<Integer> sort(Stack<Integer> s) {
        if(s.isEmpty()){
            return s;
        }
        int top = s.pop();
        sort(s);
        dosort(top , s);
        return s;
    }
    static void dosort(int topValue ,Stack<Integer> s){
        if(s.isEmpty() || s.peek()<topValue){
            s.push(topValue);
            return;
        }
        int top = s.pop();
        dosort(topValue, s);
        s.push(top);
    }
}