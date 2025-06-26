/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class Tree {
    public ArrayList<Integer> reverseLevelOrder(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<Node> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node current = queue.remove();
            stack.push(current.data);
            if(current.right!=null){
                queue.add(current.right);
            }
            if(current.left!=null){
                queue.add(current.left);
            }
        }
        while(!stack.isEmpty()){
            result.add(stack.pop());
        }
        return result;
    }
}