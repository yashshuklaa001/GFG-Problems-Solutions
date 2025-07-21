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
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        Queue<Node> queue = new LinkedList<>();
        if(root==null){
            return list;
        }
        queue.add(root);
        while(!queue.isEmpty()){
            Node current = queue.poll();
            stack.push(current.data);
            if(current.right!=null){
                queue.add(current.right);
            }
            if(current.left!=null){
                queue.add(current.left);
            }
        }
        while(!stack.isEmpty()){
            list.add(stack.pop());
        }
        return list;
    }
}