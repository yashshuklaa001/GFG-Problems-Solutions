/* class Node
class Node
{
    Node left, right;
    int data;

    Node(int d)
    {
        data = d;
        left = right = null;
    }

}*/

// This function should return head to the DLL

class Solution {
    Node prev = null;
    Node head = null;

    Node bToDLL(Node root) {
        if (root == null) return null;

        inorder(root);
        return head;
    }

    private void inorder(Node curr) {
        if (curr == null) return;

        // Left subtree
        inorder(curr.left);

        // Process current node
        if (prev == null) {
            head = curr; // First (leftmost) node becomes head of DLL
        } else {
            prev.right = curr; // Connect prev <-> curr
            curr.left = prev;
        }
        prev = curr;

        // Right subtree
        inorder(curr.right);
    }
}
