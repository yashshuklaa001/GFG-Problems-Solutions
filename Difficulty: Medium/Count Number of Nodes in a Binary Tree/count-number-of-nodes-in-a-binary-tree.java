// User function Template for Java

class Solution {

    public static int countNodes(Node root) {
        int count=1;
        if(root==null){
            return 0;
        }
        count+=countNodes(root.left);
        count+=countNodes(root.right);
        return count;
    }
}