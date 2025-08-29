/*
class Node {
    int data;
    Node next;

    Node(int d){
        data=d;
        next=null;
   }
}
*/

class Solution {
    public Node rotate(Node head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        int length = getLength(head);
        k = k % length;
        if (k == 0) return head;
        Node current = head;
        for (int i = 1; i < k && current != null; i++) {
            current = current.next;
        }
        Node newHead = current.next;
        current.next = null;
        Node tail = newHead;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = head;
        return newHead;
    }
    public int getLength(Node start) {
        int length = 0;
        while (start != null) {
            start = start.next;
            length++;
        }
        return length;
    }
}

