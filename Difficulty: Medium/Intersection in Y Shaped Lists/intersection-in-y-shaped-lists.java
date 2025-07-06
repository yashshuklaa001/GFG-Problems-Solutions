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

class Intersect {
    static Node intersectPoint(Node head1, Node head2) {
        int l1 = 0, l2 = 0;
        Node curr1 = head1;
        Node curr2 = head2;
        while (curr1 != null) {
            l1++;
            curr1 = curr1.next;
        }
        while (curr2 != null) {
            l2++;
            curr2 = curr2.next;
        }
        int diff = Math.abs(l1 - l2);
        curr1 = head1;
        curr2 = head2;
        if (l1 > l2) {
            for (int i = 0; i < diff; i++) {
                curr1 = curr1.next;
            }
        } else {
            for (int i = 0; i < diff; i++) {
                curr2 = curr2.next;
            }
        }
        while (curr1 != null && curr2 != null) {
            if (curr1 == curr2) {
                return curr1;
            }
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        return null;
    }
}
