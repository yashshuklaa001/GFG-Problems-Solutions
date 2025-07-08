class Solution {
    public static String infixToPostfix(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        for(char ch:s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                result.append(ch);
            }else if(ch=='('){
                stack.push(ch);
            }else if(ch==')'){
                while(!stack.isEmpty() && stack.peek()!='('){
                    result.append(stack.pop());
                }
                stack.pop();
            }else{
                while(!stack.isEmpty() && precedence(ch)<=precedence(stack.peek())){
                    result.append(stack.pop());
                }
                stack.push(ch);
            }
        }
        while(!stack.isEmpty()){
            result.append(stack.pop());
        }
        return result.toString();
    }
    static int precedence(char ch){
        switch(ch){
            case '+':
                case '-':
                    return 1;
            case '*':
                case '/':
                    return 2;
            case '^':
                return 3;
            default:
            return -1;
        }
    }
}