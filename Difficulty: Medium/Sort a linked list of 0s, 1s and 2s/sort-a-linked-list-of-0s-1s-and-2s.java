/* class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}*/
class Solution {
    static Node segregate(Node head) {
        Node ZeroHead = new Node(-1);
        Node OneHead  = new Node(-1);
        Node TwoHead  = new Node(-1);
        Node zero = ZeroHead;
        Node one  = OneHead;
        Node two  = TwoHead;
        Node temp = head;
        while (temp != null) {
            if (temp.data == 0) {
                zero.next = temp;
                zero = zero.next;
            } else if (temp.data == 1) {
                one.next = temp;
                one = one.next;
            } else {
                two.next = temp;
                two = two.next;
            }
            temp = temp.next;
        }
        zero.next = (OneHead.next != null) ? OneHead.next : TwoHead.next;
        one.next  = TwoHead.next;
        two.next  = null;
        return ZeroHead.next;
    }
}
