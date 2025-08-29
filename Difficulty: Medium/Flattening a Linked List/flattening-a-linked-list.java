/*
class Node {
    int data;
    Node next;
    Node bottom;

    Node(int x) {
        data = x;
        next = null;
        bottom = null;
    }
}
*/
class Solution {
    public Node flatten(Node root) {
        if(root==null || root.next==null){
            return root;
        }
        Node mergeHead = flatten(root.next);
        root = merge(root,mergeHead);
        return root;
    }
    public Node merge(Node l1,Node l2){
        if(l1==null) return l2;
        if(l2==null) return l1;
        Node dummy = new Node(-1);
        Node temp = dummy;
        while(l1!=null && l2!=null){
            if(l1.data<l2.data){
                temp.bottom=l1;
                l1=l1.bottom;
            }else{
                temp.bottom=l2;
                l2=l2.bottom;
            }
            temp=temp.bottom;
        }
        temp.bottom=(l1==null)?l2:l1;
        return dummy.bottom;
    }
}