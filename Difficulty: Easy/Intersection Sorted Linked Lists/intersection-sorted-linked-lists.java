/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    public static Node findIntersection(Node head1, Node head2) {
        Node dummy = new Node(0);
        Node curr=dummy;
        while(head1!=null && head2!=null){
            if(head1.data<head2.data){
                head1=head1.next;
            }else if(head1.data>head2.data){
                head2=head2.next;
            }else{
                curr.next=new Node(head1.data);
                curr=curr.next;
                head1=head1.next;
                head2=head2.next;
            }
        }
        return dummy.next;
    }
}