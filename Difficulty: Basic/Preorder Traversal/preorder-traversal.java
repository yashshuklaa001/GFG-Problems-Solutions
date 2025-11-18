/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> preOrder(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        helper(root,list);
        return list;
    }
    static void helper(Node root,ArrayList<Integer> list){
        if(root==null){
            return;
        }
        list.add(root.data);
        helper(root.left,list);
        helper(root.right,list);
    }
}