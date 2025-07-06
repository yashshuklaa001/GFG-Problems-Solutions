class Solution {
    public Node rotateDLL(Node head, int p) {
        
        if(head == null || head.next == null){
            return head;
        }
        
        int length = 0;
        Node curr = head;
        while(curr != null){
            length++;
            curr = curr.next;
        }
        p = p % length;
        if(p == 0){ // for large p
            return head;
        }
        
        Node tail = head;
        
        while(tail.next != null){
            tail = tail.next;
        }
        
        tail.next = head;
        head.prev = tail;
        
        for(int i = 1; i<=p; i++){
            head = head.next;
            tail =tail.next;
        }
        
        head.prev = null;
        tail.next = null;
        
        return head;
    }
}