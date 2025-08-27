/*Complete the function below*/
class GfG {
    public Stack<Integer> sort(Stack<Integer> s) {
        if(s.isEmpty()){
            return s;
        }
        int top=s.pop();
        sort(s);
        doSort(top,s);
        return s;
    }
    public void doSort(int topValue,Stack<Integer> s){
        if(s.isEmpty()||s.peek()<topValue){
            s.push(topValue);
            return;
        }
        int top=s.pop();
        doSort(topValue,s);
        s.push(top);
    }
}