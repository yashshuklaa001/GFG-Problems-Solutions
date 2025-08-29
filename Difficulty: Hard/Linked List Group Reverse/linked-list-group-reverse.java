/*node class of the linked list
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
    public static Node reverseKGroup(Node head, int k) {
        if(head==null || k==1){
            return head;
        }
        Node dummy = new Node(0);
        Node prev=dummy;
        dummy.next=head;
        Node curr = dummy.next;
        int length = getLength(head);
        while(curr!=null){
            Node start = curr;
            Node end = getKthElement(curr,k);
            if(end==null){
                end=getLastNode(start);
            }
            Node nextStart=end.next;
            end.next=null;
            prev.next=reverse(start);
            start.next=nextStart;
            prev=start;
            curr=nextStart;
            length-=k;
        }
        return dummy.next;
    }
    public static int getLength(Node start){
        int length=0;
        while(start!=null){
            start=start.next;
            length++;
        }
        return length;
    }
    public static Node getKthElement(Node start,int k){
        while(start!=null && k>1){
            start=start.next;
            k--;
        }
        return start;
    }
    public static Node reverse(Node start){
        Node prev=null;
        Node current = start;
        while(current!=null){
            Node next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }
    public static Node getLastNode(Node start){
        while(start!=null && start.next!=null){
            start=start.next;
        }
        return start;
    }
}