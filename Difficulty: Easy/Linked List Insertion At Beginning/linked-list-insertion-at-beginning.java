/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public Node insertAtFront(Node head, int x) {
        if(head==null){
            head=new Node(x);
        }
        Node temp=new Node(x);
        temp.next=head;
        return temp;
    }
}