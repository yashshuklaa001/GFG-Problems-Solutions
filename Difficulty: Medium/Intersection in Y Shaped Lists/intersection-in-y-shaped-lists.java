/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
 Linked List class
class LinkedList
{
    Node head;  // head of list
}*/

class Solution {
    public Node intersectPoint(Node head1, Node head2) {
        if(head1==null || head2==null){
            return null;
        }
        Node l1 = head1;
        Node l2 = head2;
        while(l1!=l2){
            l1=(l1==null)?head2:l1.next;
            l2=(l2==null)?head1:l2.next;
        }
        return l1;
    }
}