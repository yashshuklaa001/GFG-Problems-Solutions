/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
   Node(int item)
   {
        data = item;
        left = right = null;
    }
} */

class Solution {
    // Function to convert a binary tree into its mirror tree.
    void mirror(Node node) {
        if(node==null){
            return;
        }
        Node temp=node.left;
        node.left=node.right;
        node.right=temp;
        if(node.left!=null){
            mirror(node.left);
        }
        if(node.right!=null){
            mirror(node.right);
        }
    }
}