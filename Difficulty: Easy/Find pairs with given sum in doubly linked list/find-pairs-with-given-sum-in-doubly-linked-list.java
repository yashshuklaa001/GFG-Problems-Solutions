/*

Definition for singly Link List Node
class Node
{
    int data;
    Node next,prev;

    Node(int x){
        data = x;
        next = null;
        prev = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/

class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target,
                                                                      Node head) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Node low=head;
        Node high=findTail(head);
        while(low.data<high.data){
            if(low.data+high.data==target){
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(low.data);
                pair.add(high.data);
                result.add(pair);
                low=low.next;
                high=high.prev;
            }else if(low.data+high.data>target){
                high=high.prev;
            }else{
                low=low.next;
            }
        }
        return result;
    }
    public static Node findTail(Node head){
        while(head!=null && head.next!=null){
            head=head.next;
        }
        return head;
    }
}
