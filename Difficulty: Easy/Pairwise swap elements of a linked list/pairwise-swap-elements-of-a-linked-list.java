/* node class of the linked list

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/

class Solution {
    // Function to pairwise swap elements of a linked list.
    // It should returns head of the modified list
    public Node pairwiseSwap(Node head) {
        if(head==null || head.next==null){
            return head;
        }
        Node newHead=head.next;
        Node current = head;
        Node prev=null;
        while(current!=null && current.next!=null){
            Node first = current;
            Node second = current.next;
            Node nextPair=second.next;
            
            second.next=first;
            first.next=nextPair;
            
            if(prev!=null){
                prev.next=second;
            }
            
            prev=current;
            current=nextPair;
        }
        return newHead;
    }
}