/*
Structure of a Doubly LinkList
class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public Node delPos(Node head, int x) {
        if (head == null) return null;
        if (x == 1) {
            Node newHead = head.next;
            if (newHead != null) {
                newHead.prev = null;
            }
            return newHead;
        }
        Node curr = head;
        int count = 1;
        while (curr != null && count < x) {
            curr = curr.next;
            count++;
        }
        if (curr == null) return head;
        if (curr.prev != null) {
            curr.prev.next = curr.next;
        }
        if (curr.next != null) {
            curr.next.prev = curr.prev;
        }
        return head;
    }
}
