/*
class Node
{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    ArrayList<Integer> boundaryTraversal(Node node) {
        ArrayList<Integer> list = new ArrayList<>();
        if(node==null) return list;
        if(!isLeaf(node)) list.add(node.data);
        addLeft(node.left,list);
        addLeaf(node,list);
        addRight(node.right,list);
        return list;
    }
    public boolean isLeaf(Node root){
        if(root.left==null && root.right==null){
            return true;
        }
        return false;
    }
    public void addLeft(Node root,ArrayList<Integer> list){
        if(root==null) return;
        while(root!=null){
            if(!isLeaf(root)) list.add(root.data);
            if(root.left!=null) root=root.left;
            else root=root.right;
        }
    }
    public void addLeaf(Node root,ArrayList<Integer> list){
        if(root==null) return;
        if(isLeaf(root)){
            list.add(root.data);
            return;
        }
        addLeaf(root.left,list);
        addLeaf(root.right,list);
    }
    public void addRight(Node root,ArrayList<Integer> list){
        if(root==null) return;
        Stack<Integer> stack = new Stack<>();
        while(root!=null){
            if(!isLeaf(root)) stack.push(root.data);
            if(root.right!=null) root=root.right;
            else root=root.left;
        }
        while(!stack.isEmpty()){
            list.add(stack.pop());
        }
    }
}