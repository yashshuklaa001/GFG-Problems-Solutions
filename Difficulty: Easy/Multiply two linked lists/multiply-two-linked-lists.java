/*Node is defined as
class Node
{
    int data;
    Node next;
    Node(int data) {
        this.data=data;
        this.next = null;
    }
}*/

class Solution {
    long multiplyTwoLists(Node l1, Node l2) {
        long num1 = 0, num2 = 0;
        long MOD = 1000000007;
        while (l1 != null) {
            num1 = (num1 * 10 + l1.data) % MOD;
            l1 = l1.next;
        }
        while (l2 != null) {
            num2 = (num2 * 10 + l2.data) % MOD;
            l2 = l2.next;
        }
        return (num1 * num2) % MOD;
    }
}
