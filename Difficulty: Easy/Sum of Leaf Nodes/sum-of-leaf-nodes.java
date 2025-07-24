/*
// A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class Solution {
    // Function to return sum of all leaf nodes of a binary tree
    static int leafSum(Node root) {
        return helper(root);
    }

    private static int helper(Node root) {
        if (root == null) return 0;

        int sum = 0;
        if (root.left == null && root.right == null) {
            sum += root.data; // it's a leaf
        }
        sum += helper(root.left);
        sum += helper(root.right);
        return sum;
    }
}
