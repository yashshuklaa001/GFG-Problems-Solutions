/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    public boolean isPalindrome(Node head) {
        if(head==null||head.next==null) return true;
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node newHead = reverse(slow);
        Node first=head;
        Node second = newHead;
        while(second!=null){
            if(first.data!=second.data){
                return false;
            }
            first=first.next;
            second=second.next;
        }
        return true;
    }
    public Node reverse(Node curr){
        Node prev=null;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}