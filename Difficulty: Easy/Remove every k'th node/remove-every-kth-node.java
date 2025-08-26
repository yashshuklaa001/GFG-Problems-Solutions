/* Link list Node
class Node
{
    Node next;
    int data;
    Node(int d)
    {
        data = d;
        next = null;
    }
}*/
class Solution {
    /*You are required to complete this method*/
    Node deleteK(Node head, int k) {
     if(k==0|| head==null) return head;
     if(k==1) return null;
     int count=1;
     Node temp=head;
     while(temp!=null && temp.next!=null){
         count++;
         if(count==k){
             temp.next=temp.next.next;
             count=1;
         }
         temp=temp.next;
     }
     return head;
    }
}