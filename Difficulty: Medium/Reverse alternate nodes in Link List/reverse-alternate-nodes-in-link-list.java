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
}*/
class Solution {
    public static Node reverse(Node Head){
        Node temp = Head;
        Node next=null;
        Node prev=null;
        while(temp!=null){
            next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        return prev;
    }
    public static void rearrange(Node odd) {
        if(odd==null || odd.next==null){
            return;
        }
        Node evenHead=odd.next;
        Node oddCur=odd;
        Node evenCur=evenHead;
        while(evenCur!=null && evenCur.next!=null){
            oddCur.next=evenCur.next;
            oddCur=oddCur.next;
            evenCur.next=oddCur.next;
            evenCur=evenCur.next;
        }
        oddCur.next=null;
        evenHead=reverse(evenHead);
        oddCur.next=evenHead;
    }
}