/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node mergeKLists(Node[] arr) {
        if(arr.length==1){
            return arr[0];
        }
        if(arr.length==0){
            return null;
        }
        Node result = arr[0];
        for(int i=1;i<arr.length;i++){
            result = mergeTwoList(result,arr[i]);
        }
        return result;
    }
    Node mergeTwoList(Node l1,Node l2){
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        Node dummy = new Node(-1);
        Node temp = dummy;
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