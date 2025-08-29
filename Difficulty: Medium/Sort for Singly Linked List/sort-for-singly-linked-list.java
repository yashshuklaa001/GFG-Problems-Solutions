// User function Template for Java

/*class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    */
class Solution {
    public static Node insertionSort(Node head_ref) {
        if(head_ref==null || head_ref.next==null) return head_ref;
        Node mid = getMid(head_ref);
        Node left = head_ref;
        Node right = mid.next;
        mid.next=null;
        left=insertionSort(left);
        right=insertionSort(right);
        return merge(left,right);
    }
    public static Node getMid(Node head){
        Node slow = head;
        Node fast = slow.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static Node merge(Node l1,Node l2){
        if(l1==null) return l2;
        if(l2==null) return l1;
        Node dummy = new Node(-1);
        Node temp=dummy;
        while(l1!=null && l2!=null){
            if(l1.data<l2.data){
                temp.next=l1;
                l1=l1.next;
            }else{
                temp.next=l2;
                l2=l2.next;
            }
            temp=temp.next;
        }
        temp.next=(l1==null)?l2:l1;
        return dummy.next;
    }
}