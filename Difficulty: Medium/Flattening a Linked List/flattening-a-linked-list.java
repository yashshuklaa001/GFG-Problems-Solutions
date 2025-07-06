class Solution {
    // Function to flatten a linked list
    Node flatten(Node root) {
        // code here
        if (root == null || root.next == null)
            return root;

        // Recur for list on right
        root.next = flatten(root.next);

        // Merge current list with flattened right list
        root = merge(root, root.next);

        return root;
    }
     Node merge(Node a, Node b) {
        if (a == null) return b;
        if (b == null) return a;

        Node result;

        if (a.data < b.data) {
            result = a;
            result.bottom = merge(a.bottom, b);
        } else {
            result = b;
            result.bottom = merge(a, b.bottom);
        }

        result.next = null; // important: unlink 'next'
        return result;
    }
}