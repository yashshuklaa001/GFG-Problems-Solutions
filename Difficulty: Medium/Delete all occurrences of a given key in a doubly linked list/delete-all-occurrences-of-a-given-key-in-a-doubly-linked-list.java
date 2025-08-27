// User function Template for Java

/* Structure of Doubly Linked List
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}*/
class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
        Node temp=head;
        while(temp!=null){
            if(temp.data==x){
                if(temp==head){
                    head=head.next;
                }
                Node prevv=temp.prev;
                Node nextt=temp.next;
                if(nextt!=null) nextt.prev=prevv;
                if(prevv!=null) prevv.next=nextt; 
                temp=nextt;
            }else{
                temp=temp.next;
            }
        }
        return head;
    }
}