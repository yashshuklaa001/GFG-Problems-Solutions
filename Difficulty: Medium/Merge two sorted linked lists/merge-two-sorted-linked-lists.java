/*
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    Node sortedMerge(Node head1, Node head2) {
        if(head1==null && head2==null) return null;
        if(head1==null) return head2;
        if(head2==null) return head1;
        Node dummy=new Node(0);
        Node temp = dummy;
        Node l1 = head1;
        Node l2 = head2;
        while(l1!=null && l2!=null){
            if(l1.data<l2.data){
                temp.next=l1;
                l1=l1.next;
            }else{
                temp.next=l2;
                l2=l2.next;
            }
            temp=temp.next;
        }
        temp.next=(l1==null)?l2:l1;
        return dummy.next;
    }
}